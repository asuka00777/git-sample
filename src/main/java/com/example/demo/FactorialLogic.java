package com.example.demo;

import org.springframework.stereotype.Component;
@Component

public class FactorialLogic {
	
	public int getFactorial(int num){
		int ans=1;
		for(int i=1;i<=num;i++) {
			ans=ans*i;
		}
		return ans;
	}
}
