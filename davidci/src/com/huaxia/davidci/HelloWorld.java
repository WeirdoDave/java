package com.huaxia.davidci;

class HelloWorld { //public is a modifier
	private String name;


	HelloWorld(String name){
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "HelloWorld [name=" + name + "]";
	}


	public static void main1(String[] args) {//static is also a modifier, void is a return type
		System.out.println("Hello World");


	}

}
