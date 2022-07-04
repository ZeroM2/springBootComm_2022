package com.lmy.exam.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserHomeController {
	private int count;  //전역변수 count 선언 
	public UserHomeController() { //생성자 
		count = -1;
	}


		@RequestMapping("/user/home/getCount")
		@ResponseBody
		public int getCount() {
		
			return count; 
		}  
		@RequestMapping("/user/home/doSetCount")
		@ResponseBody
		public String doSetcount(int count){
			this.count = count;
			return "count의 값이" + this.count + "초기화되었습니다.";
				
			
		}  


}
