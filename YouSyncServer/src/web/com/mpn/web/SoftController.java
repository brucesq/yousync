/**
 * 
 */
package com.mpn.web;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.io.FileUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springside.modules.web.Servlets;

import com.google.common.collect.Maps;
import com.mpn.sd.SoftwareItem;
import com.mpn.service.AccountService;
import com.mpn.service.BussinessService;
import com.mpn.service.GloableService;
import com.mpn.service.ShiroDbRealm.ShiroUser;
import com.sinaapp.msdxblog.apkUtil.entity.ApkInfo;
import com.sinaapp.msdxblog.apkUtil.utils.ApkUtil;
import com.sinaapp.msdxblog.apkUtil.utils.IconUtil;

/**
 * @author quanzhi
 * 
 */
@Controller
@RequestMapping(value = "/soft")
public class SoftController {

	private static Map<String, String> sortTypes = Maps.newLinkedHashMap();
	static {
		sortTypes.put("auto", "自动");
		sortTypes.put("title", "标题");
	}

	private static final String PAGE_SIZE = "50";

	@Autowired
	private BussinessService bussinessService;

	@Autowired
	private ApkUtil apkUtil;

	@Autowired
	private GloableService gloableService;
	
	@Autowired
	private AccountService accountService;


	// 特别设定多个ReuireRoles之间为Or关系，而不是默认的And.
	@RequiresRoles(value = { "Admin", "User" }, logical = Logical.OR)
	@RequestMapping
	public String list(
			@RequestParam(value = "page", defaultValue = "1") int pageNumber,
			@RequestParam(value = "page.size", defaultValue = PAGE_SIZE) int pageSize,
			@RequestParam(value = "sortType", defaultValue = "auto") String sortType,
			Model model, ServletRequest request) {

		Map<String, Object> searchParams = Servlets.getParametersStartingWith(
				request, "search_");
		Page<SoftwareItem> softs = bussinessService.getSoftItem(searchParams,
				pageNumber, pageSize, sortType);
		for(SoftwareItem item :softs){
			bussinessService.getSoftwareItemChannel(item);
			System.out.println(item.getChannelNames());
		}

		model.addAttribute("softs", softs);
		model.addAttribute("sortType", sortType);
		model.addAttribute("sortTypes", sortTypes);
		model.addAttribute("iconPrefix", gloableService.getDownloadUrl());
		// 将搜索条件编码成字符串，用于排序，分页的URL
		model.addAttribute("searchParams", Servlets
				.encodeParameterStringWithPrefix(searchParams, "search_"));

		return "soft/softList";

	}

	@RequiresRoles(value = { "Admin", "User" }, logical = Logical.OR)
	@RequestMapping(value = "update/{id}", method = RequestMethod.GET)
	public String updateForm(@PathVariable("id") Long id, Model model) {
		
		model.addAttribute("soft", bussinessService.getSoftwareItemChannel(bussinessService.getSoftwareItem(id)));
		model.addAttribute("allStatus", SoftwareItem.getAllStatus());
		model.addAttribute("allChannels", accountService.getAllChannel());
		
		return "soft/softForm";
	}

	@RequiresRoles(value = { "Admin", "User" }, logical = Logical.OR)
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(@Valid @ModelAttribute("soft") SoftwareItem item,
			@RequestParam(value = "channelList") List<Long> checkedChannelList,
			RedirectAttributes redirectAttributes) {
		String channelIds = "@";
		for(Long cid : checkedChannelList){
			channelIds += cid.toString() +"@";
		}
		item.setChannels(channelIds);
		bussinessService.saveSoftItem(item);
		redirectAttributes.addFlashAttribute("message", "保存应用包成功");
		return "redirect:/soft";
	}

	@RequiresRoles(value = { "Admin", "User" }, logical = Logical.OR)
	@RequestMapping(value = "upload", method = RequestMethod.POST)
	public String upload(
			@RequestParam(value = "softType", defaultValue = "默认") String softType,
			@RequestParam(value = "price", defaultValue = "1.0") String price,
			@RequestParam(value = "channelList") List<Long> checkedChannelList,
			@RequestParam MultipartFile apkFile, HttpServletRequest request) {
		try {
			Subject currentUser = SecurityUtils.getSubject();
			ShiroUser sUser = (ShiroUser) currentUser.getPrincipal();

			String realPath = gloableService.getUploadPath();

			File newFile = new File(realPath, apkFile.getOriginalFilename());
			FileUtils.copyInputStreamToFile(apkFile.getInputStream(), newFile);
			SoftwareItem item = new SoftwareItem();
			ApkInfo apkInfo = apkUtil.getApkInfo(newFile.getAbsolutePath());
			item.setApkFile(apkFile.getOriginalFilename());
			item.setIconUrl("icon/" + apkInfo.getPackageName() + ".png");
			item.setPackageName(apkInfo.getPackageName());
			item.setName(apkInfo.getApplicationLable());
			item.setVersion(apkInfo.getVersionCode());
			item.setPrice(price);
			item.setSoftType(softType);
			item.setStatus("enabled");
			IconUtil.extractFileFromApk(newFile.getAbsolutePath(), IconUtil
					.getLargeIcon(apkInfo.getApplicationIcons(),
							apkInfo.getApplicationIcon()), realPath + "icon/"
					+ apkInfo.getPackageName() + ".png");
			String channelIds = "@";
			for(Long cid : checkedChannelList){
				channelIds += cid.toString() +"@";
			}
			item.setChannels(channelIds);
			bussinessService.saveSoftItem(item);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/soft";
	}

	@RequiresRoles(value = { "Admin", "User" }, logical = Logical.OR)
	@RequestMapping(value = "create", method = RequestMethod.GET)
	public String uploadForm(Model model) {
		model.addAttribute("allChannels", accountService.getAllChannel());
		model.addAttribute("soft", new SoftwareItem());
		return "soft/softUpload";
	}

	
	@ModelAttribute
	public void getSoft(@RequestParam(value = "id", defaultValue = "-1") Long id, Model model) {
		if (id != -1) {
			model.addAttribute("soft", bussinessService.getSoftwareItem(id));
		}
	}
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setDisallowedFields("channelList");

	}
}
