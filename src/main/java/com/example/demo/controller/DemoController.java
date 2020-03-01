package com.example.demo.controller;

import com.example.demo.entity.Article;
import com.example.demo.service.ArticleService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/blog")
public class DemoController {

	@Autowired
	private ArticleService articleService;

	@RequestMapping("")
	public String toIndexPage(Model model) {

		PageInfo<Article> pageInfo = articleService.selectByPageHelper(1, 2);
		model.addAttribute("pageInfo", pageInfo);

		return "client/index";
	}

	@RequestMapping("/query")
	public String getByPageHelper(Model model, Integer pageNum, Integer pageSize) {
		PageInfo<Article> pageInfo = articleService.selectByPageHelper(pageNum, pageSize);
		model.addAttribute("pageInfo", pageInfo);

		return "client/index";
	}

}
