package com.example.demo.controller;

import com.example.demo.entity.Article;
import com.example.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/index")
public class DemoController {

	@Autowired
	private ArticleService articleService;

	@RequestMapping("/")
	public String toIndexPage(Model model) {
		List<Article> articles = articleService.selectAll();
		model.addAttribute("articles", articles);
		return "client/index";
	}

}
