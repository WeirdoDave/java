package com.huaxia.davidci;

public class SimpleClass3 {
	
	private static Object SimpleClass3;
	private String name;
	
	public SimpleClass3(String newName){
		name = newName;
		
	}
	public SimpleClass3() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return name;
		

	}
	public static void main(String[] args) {
		SimpleClass3 sc1 = new SimpleClass3("John");
		System.out.println(sc1);
		SimpleClass3 sc2 = new SimpleClass3("David");
		System.out.println(sc2);
		System.out.println(sc2==sc1);
		SimpleClass3 sc3 = new SimpleClass3();
		sc3.setName("David");
		System.out.println(sc3);
	}
	public static Object getSimpleClass3() {
		return SimpleClass3;
	}
	public static void setSimpleClass3(Object simpleClass3) {
		SimpleClass3 = simpleClass3;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
