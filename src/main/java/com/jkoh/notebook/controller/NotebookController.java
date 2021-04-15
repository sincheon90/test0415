package com.jkoh.notebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jkoh.notebook.service.MemoService;

@Controller
public class NotebookController {
	
	@Autowired
	private MemoService memoService;
	
	@RequestMapping("/")
	public String welcome(Model model) {
		System.out.println("NotebookController");
		model.addAttribute("headLine", "오정권 노트");
		model.addAttribute("question", "지금 당신의 기분은?");
		return "notebook";
	}
	
	@PostMapping("insertMemo")
	public String insertHandler(Model model,
			@RequestParam(value="content") String c) {
		memoService.insertMemo(c);
		return "redirect:/";
	}
}
