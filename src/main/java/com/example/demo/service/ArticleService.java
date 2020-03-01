package com.example.demo.service;


import com.example.demo.entity.Article;
import com.github.pagehelper.PageInfo;

public interface ArticleService {
	PageInfo<Article> selectByPageHelper(Integer pageNum, Integer pageSize);
}
