package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class CalcLogic {
	public int add(int num1,int num2) {
		return num1+num2;
	}
	public int sub(int num1,int num2) {
		return num1-num2;
	}
	public int multi(int num1,int num2) {
		return num1*num2;
	}
	public double div(double num1,double num2) {
		return num1/num2;
	}
}
