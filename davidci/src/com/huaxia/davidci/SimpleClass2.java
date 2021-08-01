package com.huaxia.davidci;

public class SimpleClass2 {
	
	@Override //overrdie default toString( method defined in Object class
	public String toString() {
		return "Simple Class 2";
	}

	public static void main(String[] args) {
		SimpleClass2 sc2 = new SimpleClass2();
		System.out.println(sc2);
		SimpleClass2 sc3 = new SimpleClass2();
		System.out.println(sc3);
		
		
	}

}
