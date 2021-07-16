package com.huaxia.john;

/**
 * learn
 * System.out.println()
 * System.out.print()
 * System.out.printf()
 * 
 * @author John
 *
 */
public class Print {

	public static void main(String[] args) {
		// calculate area of a rectangle
		int width = 4;
		int length = 5;
		int area = width * length; //4 is width, and 5 is length
		// %d is placeholder for integer, \n is new line called escape sequence
		System.out.printf("rectangle area with width=%d and length=%d is %d.\n", width, length, area);

	}

}
