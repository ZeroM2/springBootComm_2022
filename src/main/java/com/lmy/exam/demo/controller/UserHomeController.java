package com.lmy.exam.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserHomeController {
		@RequestMapping("/user/home/getString")
		@ResponseBody
		public String getString() {
		
			return "hi";
			
}


		@RequestMapping("/user/home/getInt")
		@ResponseBody
		public int getint() {
		
			return 10;
		}

		@RequestMapping("/user/home/getFloat")
		@ResponseBody
		public float getFloat() {
		
			return 1.5f;
		}

		@RequestMapping("/user/home/getDouble")
		@ResponseBody
		public double getDouble() {
		
			return 1.5;
		}

		@RequestMapping("/user/home/getBoolean")
		@ResponseBody
		public boolean getBoolean() {
		
			return true;
		}
		@RequestMapping("/user/home/getCharacter")
		@ResponseBody
		public char getCharacter() {
		
			return 'a';
		}
		@RequestMapping("/user/home/getList")
		@ResponseBody
		public List<String> getList() {
			List<String> list = new ArrayList<>();
			list.add("철수");
			list.add("영희");
			
			return list;
		}
		@RequestMapping("/user/home/getArticle")
		@ResponseBody
		public Article getArticle() {
			Article article = new Article();
			return article;
		}
		
		
}

class Article {
	public int id;
	public String title;
	
	public Article() {
		id = 1;
		title = "제목1";
	}
	
} 