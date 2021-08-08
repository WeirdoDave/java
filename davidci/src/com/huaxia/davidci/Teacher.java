package com.huaxia.davidci;

public class Teacher extends Person{ //Teacher is a subclass of Person
	
	public Teacher(String name) {
		super(name);
	}

	@Override
	public String getOccupation() {
		// TODO Auto-generated method stub
		return "Teacher";
	}

	@Override
	public String toString() {
		return "Teacher [name="+ name + "]"; // protected feild can be used in subclass directly
	
	}

	@Override
	public double add(double x, double y) {
		// TODO Auto-generated method stub
		return x + y;
	}

}
