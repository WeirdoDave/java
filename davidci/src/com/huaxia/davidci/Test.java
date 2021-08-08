package com.huaxia.davidci;

public class Test {

	public static void main(String[] args) {
		SimpleClass1 sc1 = new SimpleClass1(); // create instance of SimpleClass1 by default contrustor
		System.out.println(sc1);
		System.out.println(sc1.getClass().getName());
		SimpleClass3 sc2 = new SimpleClass3("John");
		System.out.println(sc2);
		System.out.println(sc2.getClass().getName());
				
		
	}

}
