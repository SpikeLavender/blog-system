package com.example.demo.mapper;


import com.example.demo.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ArticleMapper {

	@Select("select * from t_article")
	List<Article> selectAll();
}
