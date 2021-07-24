package com.huaxia.davidci;

public class IfElse {
	
	public static void main(String[] args) {
		int hour = 14;
		
		// if Statement
		if (hour <= 12) {
			System.out.println("Good Morning!");
		}

		// if-else statement
		if (hour < 18) {
			System.out.println("Good Day!");
		}else {
			System.out.println("Good Evening!");
		}
		
		// if- else if- else statement
		if (hour < 12) {
			System.out.println("Good Morning!");
		}else if(hour>12 && hour<18) {
			System.out.println("Good Afternoon!");
		}else {
			System.out.println("Good Evening!");
		}
		
	}

}


