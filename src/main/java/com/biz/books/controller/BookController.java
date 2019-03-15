package com.biz.books.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.books.model.BookVO;
import com.biz.books.service.BookService;

@Controller
public class BookController {

	@Autowired
	BookService bService;
	
	@RequestMapping(value="post_list", method=RequestMethod.GET)
	public String book_post(Model model) {
		
		List<BookVO> bList = bService.selectAll();
		model.addAttribute("POSTS", bList);
		return "post_list";
	}
	
	@RequestMapping(value="write_form", method=RequestMethod.GET)
	public String write_form(Model model) {
		
		BookVO bookVO = new BookVO();
		model.addAttribute("POST", bookVO);
		return "write_form";
	}
	
	@RequestMapping(value="insert", method=RequestMethod.POST, produces="text/html;charset=utf8")
	public String write_form(@ModelAttribute BookVO bookVO) {
		bService.insert(bookVO);
		return "redirect:/";
	}
}
