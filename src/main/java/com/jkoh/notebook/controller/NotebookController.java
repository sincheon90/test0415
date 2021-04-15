package com.jkoh.notebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NotebookController {
	@RequestMapping("/")
	public String welcome(Model model) {
		System.out.println("NotebookController");
		model.addAttribute("headLine", "오정권 노트");
		model.addAttribute("question", "지금 당신의 기분은?");
		return "notebook";
	}
}
