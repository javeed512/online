package com.capg;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;




//@RestController
@Controller
@RequestMapping("/app")
public class HelloController {	
	@Autowired
	EmpRepository repo;
	
	//@PostMapping(path = "/add")
	@RequestMapping("/add")
	public String addEmployee(@RequestParam("eid") int eid,@RequestParam("ename") String ename,@RequestParam("sal") double sal, HttpSession session) {

			Employee emp  = new Employee();
			
				emp.setEid(eid);
				emp.setEname(ename);
				emp.setSal(sal);
		
		 session.setAttribute("empObj", emp);

		System.out.println(emp);

		repo.save(emp);
		
		return "display";

	}

	/*
	 * //@RequestMapping("/display")
	 * 
	 * @GetMapping("/display") //@ResponseBody public ResponseEntity<String>
	 * display(@RequestParam("uname") String uname , HttpSession session) {
	 * 
	 * 
	 * System.out.println(bank1); System.out.println(bank2);
	 * 
	 * session.setAttribute("uname", uname);
	 * 
	 * 
	 * 
	 * return new ResponseEntity<String>("Transaction Completed",HttpStatus.OK);
	 * 
	 * 
	 * }
	 */

}
