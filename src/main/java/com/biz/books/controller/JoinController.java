package com.biz.books.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.books.model.JoinVO;
import com.biz.books.service.JoinService;

@Controller
public class JoinController {

	@Autowired
	JoinService jService;
	
	@RequestMapping(value="join", method=RequestMethod.GET)
	public String join_form(Model model) {
		JoinVO joinVO = new JoinVO();
		model.addAttribute("JOIN", joinVO);
		return "join_form";
	}

	@RequestMapping(value="join", method=RequestMethod.POST, produces="text/html;charset=utf8")
	public String join_form(@ModelAttribute JoinVO joinVO) {
		jService.insert(joinVO);
		return "redirect:/";
	}
	
}
