package com.huaxia.davidci;

public class TryCatch {

	public static void main(String[] args) {
		SimpleMath sm = new SimpleMath();
		try {
		double area = sm.circleArea(-2);
		System.out.println(area);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Done.");
	}

}
