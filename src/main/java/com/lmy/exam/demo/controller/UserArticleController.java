package com.lmy.exam.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lmy.exam.demo.valueObject.Article;

@Controller
public class UserArticleController {
	@RequestMapping("/user/article/doAdd")
	@ResponseBody
	public Article doAdd(String title, String body) {
		int id = 1;
		 
		Article article = new Article();
		return article;
	}
}
	