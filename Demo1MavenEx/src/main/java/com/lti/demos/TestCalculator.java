package com.lti.demos;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		int r=c.addNos(100,200);
		System.out.println("Additionnnn is: "+r);
		
		int x=c.subNos(500, 200);
		System.out.println("Subtraction is :"+x);
	}
}
