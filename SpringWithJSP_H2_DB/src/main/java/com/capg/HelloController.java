package com.capg;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/app")
public class HelloController {
	
	@Autowired
	EmpRepository repo;
	
		
	@PostMapping("/add")
	public String addEmployee(@RequestParam("eid") int eid, @RequestParam("ename") String ename,
						@RequestParam("sal") double sal, HttpSession session) {
		
		
		
		Employee emp  = new Employee();
		
		emp.setEid(eid);
		emp.setEname(ename);
		emp.setSal(sal);
		
		
		session.setAttribute("emp", emp);
		
		
		repo.save(emp);  // adding to h2 db 
		
		
		return "display";
		
	}
	
	

}
