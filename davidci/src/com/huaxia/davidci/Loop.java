package com.huaxia.davidci;

public class Loop {
	static String[] days = { "No Such Day!", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

	public static void main(String[] args) {
		// for loop
		for (int i = 1; i <= 10; i++) { // initial value, loop condition, adjustment of the value
			System.out.print(i + " ");
		}
		System.out.println();

		// for loop with negative step
		for (int i = 10; i > 0; i--) {
			System.out.print(i + " ");

		}
		System.out.println();

		// increase variable by 2
		for (int i = 0; i <= 10; i += 2) { // i = i+2
			System.out.print(i + " ");
		}

		// for-each loop

		for (String day : days) {
			System.out.println(day + ", ");

		}
		System.out.println();

		// continue on for-loop
		for (int i = 0; i <= 10; i++) {
			System.out.println("code block before continue...");
			if (i < 3 || i > 6) {
				continue; // java reserved keyboard
			}
		
			System.out.println(i + " ");
		}
		
		// break on for-loop: homework create a drawing using mermaid for break.
		for (int i=0; i<=10; i++) {
			System.out.println("code block before break condition...");
			if(i>5) {
				break;
			}
			System.out.print(i+ " ");
		}
		System.out.println("END");

		
	
		
	}

}
