package com.example.demo.service.impl;

import com.example.demo.entity.Article;
import com.example.demo.mapper.ArticleMapper;
import com.example.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleMapper articleMapper;

	@Override
	public List<Article> selectAll() {

		return articleMapper.selectAll();
//		ArrayList<Article> articles = new ArrayList<>();
//		Article article = new Article();
//		Date date = new Date(System.currentTimeMillis());
//		article.setCreated(date);
//		article.setContent("test");
//		article.setTitle("test ti");
//
//		articles.add(article);
//
//		return articles;
	}
}
