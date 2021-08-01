package com.huaxia.davidci;

import java.util.ArrayList;
import java.util.Collections;

public class MyArrayList {
	
	public static void main(String[] args) {
		// differnece between array and Arraylist is you can modify ArrayList not array
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println(al.size());
		al.add(3);
		al.add(1);
		al.add(10);
		al.add(2);
		System.out.println(al);
		al.remove(Integer.valueOf(2));
		System.out.println(al);
		Collections.sort(al); // order a integer array
		System.out.println(al);
		
		
		ArrayList<Hello> hl = new ArrayList<>();
		hl.add(new Hello("John"));
		hl.add(new Hello("David"));
		System.out.println(hl);
		
	}

}
