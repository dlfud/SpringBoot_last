package com.sbs.exam.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserHomeController {
	
	int count;
	
	public UserHomeController() {
		count = 0;
	}
	
	@RequestMapping("/user/home/main")
	@ResponseBody
	public String showMain() {
		return "안녕하세요.";
	}
	
	@RequestMapping("/user/home/main2")
	@ResponseBody
	public String showMain2() {
		return "반갑습니다.";
	}
	
	@RequestMapping("/user/home/main3")
	@ResponseBody
	public String showMain3() {
		return "또 만나요.";
	}
	
	@RequestMapping("/user/home/getCount")
	@ResponseBody
	public int getCount() {
		count++;
		return count;
	}
	
	@RequestMapping("/user/home/setCount")
	@ResponseBody
	public String setCount() {
		count = 0;
		return "count 값이 0으로 초기화 되었습니다.";
	}
}
