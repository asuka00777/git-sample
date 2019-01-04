package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factorial")
public class FactorialController {
	@Autowired
	private FactorialLogic factorialLogic;
	
	@RequestMapping("/view-result")
	public int viewResult(){
		int result=factorialLogic.getFactorial(8);
		return result;
	}
	
}
