package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalcController {
	@Autowired
	private CalcLogic calcLogic;
	
	@RequestMapping("/add")
	public String add() {
		int num1=2;
		int num2=3;
		int resultOfAdd=calcLogic.add(num1,num2);
		return num1+"+"+num2+"="+resultOfAdd;
	}
	@RequestMapping("/sub")
	public String sub() {
		int num1=2;
		int num2=3;
		int resultOfSub=calcLogic.sub(num1,num2);
		return num1+"-"+num2+"="+resultOfSub;
	}
	@RequestMapping("/multi")

	public String multi() {
		int num1=2;
		int num2=3;
		int resultOfMulti=calcLogic.multi(num1,num2);
		return num1+"*"+num2+"="+resultOfMulti;
	}
	@RequestMapping("/div")

	public String div() {
		double num1=2;
		double num2=3;
		double resultOfDiv=calcLogic.div(num1,num2);
		return num1+"/"+num2+"="+resultOfDiv;
	}
}
