package com.huaxia.davidci;

public abstract class Person implements Occupation{
	
	protected String name;

	public Person(String name){
		this.name = name;
	}
	
	public int add(int x, int y) {
		return x + y;
	}

	public abstract double add(double x, double y);
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

}
