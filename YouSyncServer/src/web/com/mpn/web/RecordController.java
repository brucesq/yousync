/**
 * 
 */
package com.mpn.web;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mpn.service.RecordService;

/**
 * @author quanzhi
 * 
 */
@Controller
@RequestMapping(value = "/record")
public class RecordController {

	@Autowired
	private RecordService recordService;
	// 特别设定多个ReuireRoles之间为Or关系，而不是默认的And.
	@RequiresRoles(value = { "Admin", "User" }, logical = Logical.OR)
	@RequestMapping(value = "lastrecordlist", method = RequestMethod.GET)
	public String lastList(Model model) {
		model.addAttribute("records", recordService.getLastRecordList());
		return "record/lastrecordList";
	}
}
