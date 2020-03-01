package com.example.demo.mapper;

import com.example.demo.entity.Article;
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

}
