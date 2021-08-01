package com.huaxia.davidci;

public class Hello {
	
	private String name;

	Hello(String name){
		this.name = name;
	}

	@Override
	public String toString() {
		return "Hello [name=" + name + "]";
	}

}
