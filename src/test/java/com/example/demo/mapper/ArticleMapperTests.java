package com.example.demo.mapper;

import com.example.demo.entity.Article;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
public class ArticleMapperTests {


	@Autowired
	private ArticleMapper articleMapper;

	@Test
	void testSelectAll() {
		List<Article> articles = articleMapper.selectAll();

		articles.forEach(System.out::println);
	}

	@Test
	void testByPageSize() {
		PageHelper.startPage(1, 2);
		List<Article> articles = articleMapper.selectAll();
		articles.forEach(System.out::println);
		PageInfo<Article> pageInfo = new PageInfo<>(articles);
		System.out.println("总条数: " + pageInfo.getTotal());
		System.out.println("总页数: " + pageInfo.getPages());
		System.out.println("当前页: " + pageInfo.getPageNum());
		System.out.println("每页显示的条数: " + pageInfo.getPageSize());
		System.out.println(pageInfo.getList());
	}

}
