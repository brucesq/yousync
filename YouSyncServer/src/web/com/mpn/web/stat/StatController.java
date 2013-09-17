package com.mpn.web.stat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mpn.service.RecordService;

@Controller
@RequestMapping(value = "/stat")
public class StatController {
	@Autowired
	private RecordService recordService;
	
	@RequestMapping(value = "newlist", method = RequestMethod.GET)
	public String updateForm(Model model) {
		model.addAttribute("records", recordService.getLastRecordList());
		return "stat/newlist";
	}
}
