package com.lmy.exam.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserHomeController {
	private int count;  //전역변수 count 선언 
	public UserHomeController() { //생성자 
		count = 0;  // 
	}
	@RequestMapping("/user/home/main")
	@ResponseBody
	public String showMain() {
		return "안녕하세요.";
	} 
	
		@RequestMapping("/user/home/main2")
		@ResponseBody
		public String showMain2() {
			return "반갑습니다";
		}
		@RequestMapping("/user/home/main3")
		@ResponseBody
		public String showMain3() {
			return "또 만나요오";
		}
		@RequestMapping("/user/home/main4")
		@ResponseBody
		public int showMain4() {
			return count++; //일단 0의 값을 리턴하고 카운트에  1을 더한다 
		}  
		@RequestMapping("/user/home/main5")
		@ResponseBody
		public String showMain5() {
			count = 0;
			return "count의 값이 초기화되었습니다."; //일단 0의 값을 리턴하고 카운트에  1을 더한다 
			
		
		}  

}
