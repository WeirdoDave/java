package com.huaxia.davidci;

public class SimpleMath {
	double add (double x, double y) {
		return x + y;
		
	}
	
	int add (int x, int y) {// method overlaoding: same method name with differnet
		return x + y;
	}
	double circleArea(double r) throws Exception {
		if (r<0) {
			throw new Exception("Circle radius cannot be negative.");
		}
		return Math.PI * r * r;
	}
	public static void main(String[] args) throws Exception {
		SimpleMath sm = new SimpleMath();
		try {
		double z = sm.add(2.3, 5.6);
		System.out.println(z);
		z = sm.add(3,  7);// put smaller value to big container
		System.out.println(z);
		z = sm.circleArea(-2);
		System.out.println(z);
	}catch(Exception e) {
			System.out.println(e.getMessage());
	}
		System.out.println("Done.");
	}

}
