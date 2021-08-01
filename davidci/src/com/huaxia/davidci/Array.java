package com.huaxia.davidci;

import java.util.Arrays;

/**
 * An array in Java is a set of varibles referenced by using a single varible
 * name combined with an index number
 */

public class Array {

	public static void main(String[] args) {
		// initialize an interger array}
		int[] a = { 10, 11, 2, 33, 5, 10 };

		// array is iterable
		// 1. initial loop varible; 2. check condition on varible; 3. adjust varible
		for (int i = 0; i < a.length; i++) { // for-loop is more flexible
			System.out.print(i + " ");
			System.out.println(a[i]);

		}

		// for-each to interate array, no index, go through every item in the array
		for (int v : a) {
			System.out.println(v);
		}

		// Java defined data type array
		String[] sa = { "Glass", "Plastic", "Paper", "China" };// different cup type
		for (int i = 0; i < sa.length; i++) {
			System.out.print(i + " ");
			System.out.print(sa[i] + "; ");

		}
		System.out.println();
		for (String cupType : sa) {
			System.out.print(cupType + "; ");
		}
		System.out.println();

		// developr defined data type array
		Hello[] ha = { new Hello("John"), new Hello("David"), new Hello("Charles") };
		System.out.println(Arrays.toString(ha));
		// Create array
		int[] ia = new int[10];
		System.out.println(Arrays.toString(ia));
		ia[5] = 4;
		System.out.println(Arrays.toString(ia));

		Hello[] hellos = new Hello[5];
		System.out.println(Arrays.toString(hellos));
		hellos[2] = new Hello("Marivn"); // assign individual
		System.out.println(Arrays.toString(hellos));

	}

}
