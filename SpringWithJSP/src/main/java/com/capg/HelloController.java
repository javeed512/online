package com.capg;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/app")
public class HelloController {
	
	@Autowired
	Bank bank1;
	

	@Autowired
	Bank bank2;
	
	
	//@RequestMapping("/display")
	@GetMapping("/display")
	//@ResponseBody
	public String display(@RequestParam("uname") String uname , HttpSession session) {
		
		
		System.out.println(bank1);
		System.out.println(bank2);
		
				session.setAttribute("uname", uname);
		
		
		
		return "display";
		
		
	}
	
	
	

}
