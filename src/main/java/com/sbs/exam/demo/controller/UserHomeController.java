package com.sbs.exam.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sbs.exam.demo.vo.Article;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Controller
public class UserHomeController {
	
//	int count;
//	
//	public UserHomeController() {
//		count = 0;
//	}
//	
//	@RequestMapping("/user/home/main")
//	@ResponseBody
//	public String showMain() {
//		return "안녕하세요.";
//	}
//	
//	@RequestMapping("/user/home/main2")
//	@ResponseBody
//	public String showMain2() {
//		return "반갑습니다.";
//	}
//	
//	@RequestMapping("/user/home/main3")
//	@ResponseBody
//	public String showMain3() {
//		return "또 만나요.";
//	}
//	
//	@RequestMapping("/user/home/getCount")
//	@ResponseBody
//	public int getCount() {
//		count++;
//		return count;
//	}
//	
//	@RequestMapping("/user/home/setCount")
//	@ResponseBody
//	public String setCount(int count) {
//		this.count = count;
//		return "count 값이 " + this.count + "으로 초기화 되었습니다.";
//	}
	
//	============================================
	
//	어떤 타입으로 날려도 결국에는 문장으로 바뀔것이다.
	@RequestMapping("/user/home/getString")
	@ResponseBody
	public String getString() {
		return "HI";
	}
	
	@RequestMapping("/user/home/getInt")
	@ResponseBody
	public int getInt() {
		return 10;
	}
	
	@RequestMapping("/user/home/getFloat")
	@ResponseBody
	public float getFloat() {
		return 10.5f;
	}
	
	@RequestMapping("/user/home/getDouble")
	@ResponseBody
	public double getDouble() {
		return 10.5;
	}
	
	@RequestMapping("/user/home/getBoolean")
	@ResponseBody
	public boolean getBoolean() {
		return true;
	}
	
	@RequestMapping("/user/home/getChar")
	@ResponseBody
	public char getChar() {
		return 'a';
	}
	
	@RequestMapping("/user/home/getMap")
	@ResponseBody
	public HashMap getMap() {
		HashMap<String, Object> map = new HashMap<>();
		map.put("철수나이", 22);
		map.put("영희나이", 21);
		return map;
	}
	
	@RequestMapping("/user/home/getList")
	@ResponseBody
	public List<String> getList() {
		List<String> list = new ArrayList<>();
		list.add("쳘수, 영희");
		return list;
	}
	
	@RequestMapping("/user/home/getArticle")
	@ResponseBody
	public Article getArticle() {
		Article article = new Article(1, "제목 1", "내용1");
		
		return article;
	}
	
	@RequestMapping("/user/home/getArticles")
	@ResponseBody
	public List<Article> getArticles() {
		Article article1 = new Article(1, "제목 1", "내용1");
		Article article2 = new Article(2, "제목 2", "내용2");
		
		List<Article> list = new ArrayList<>();
		list.add(article1);
		list.add(article2);
		return list;
	}
	
	
}