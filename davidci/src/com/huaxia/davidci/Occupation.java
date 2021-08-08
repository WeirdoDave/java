package com.huaxia.davidci;

public interface Occupation {
	int ENGINEER = 1;
	int TEACHER = 2;
	final int DEVELOPER = 3; // the field deinfed in interface is public constant
	String getOccupation(); // a method in interface is abstract, public
}
