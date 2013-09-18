/**
 * 
 */
package com.mpn.web.channel;

import java.util.Map;

import javax.servlet.ServletRequest;
import javax.validation.Valid;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springside.modules.web.Servlets;

import com.google.common.collect.Maps;
import com.mpn.sd.Channel;
import com.mpn.service.AccountService;

/**
 * @author quanzhi
 *
 */
@Controller
@RequestMapping(value = "/channel")
public class ChannelController {
	
	private static final String PAGE_SIZE = "50";
	
	private static Map<String, String> sortTypes = Maps.newLinkedHashMap();
	static {
		sortTypes.put("auto", "自动");
		sortTypes.put("title", "标题");
	}
	
	@Autowired
	private AccountService accountService;
	
	@RequiresRoles("Admin")
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String updateForm(Model model) {
		model.addAttribute("item", new Channel());
		return "channel/channelForm";
	}
	
	@RequiresRoles("Admin")
	@RequestMapping(value = "update/{id}", method = RequestMethod.GET)
	public String updateForm(@PathVariable("id") Long id, Model model) {
		model.addAttribute("item", accountService.getChannel(id));
		return "channel/channelForm";
	}
	
	@RequiresRoles("Admin")
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(@Valid @ModelAttribute("item") Channel item,
			 RedirectAttributes redirectAttributes) {

		accountService.saveChannel(item);

		redirectAttributes.addFlashAttribute("message", "保存渠道成功");
		return "redirect:/channel";
	}
	
	
	@RequiresRoles(value = { "Admin", "User" }, logical = Logical.OR)
	@RequestMapping
	public String list(
			@RequestParam(value = "page", defaultValue = "1") int pageNumber,
			@RequestParam(value = "page.size", defaultValue = PAGE_SIZE) int pageSize,
			@RequestParam(value = "sortType", defaultValue = "auto") String sortType,
			Model model, ServletRequest request) {

		Map<String, Object> searchParams = Servlets.getParametersStartingWith(
				request, "search_");
		Page<Channel> items = accountService.getChannel(searchParams,
				pageNumber, pageSize, sortType);

		model.addAttribute("items", items);
		model.addAttribute("sortType", sortType);
		model.addAttribute("sortTypes", sortTypes);
		
		// 将搜索条件编码成字符串，用于排序，分页的URL
		model.addAttribute("searchParams", Servlets
				.encodeParameterStringWithPrefix(searchParams, "search_"));

		return "channel/channelList";

	}
	
	
	@ModelAttribute
	public void getItem(@RequestParam(value = "id", defaultValue = "-1") Long id, Model model) {
		if (id != -1) {
			model.addAttribute("item", accountService.getChannel(id));
		}
	}
}
