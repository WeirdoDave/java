package com.huaxia.davidci;

public class DataType {

	public static void main(String[] args) {
		boolean b = true;
		//boolean is a special data type. Only has 2 values: true and false
		byte myByte = 0b110011;// 1 byte = 8 bits.
		char c = 'A';
		short s = 128;
		int i = 12345;
		long l = 12345678912345L; //put L at the end to make it long.
		float f = 123.123F;// put F at the end to make it float.
		double d = 12.32; //by default, any decimal number is a double
		
		//cast: you can put smaller values to a big container, but not vice versa
		System.out.println(i + ", " + l);
		i = (int)l;// DANGEROUS, may lose data
		System.out.println("i - " + i);
		l = i; //put smaller value to large container
		System.out.println("l - " + l);
		
		// Java define data type
		String s1 = "John";
		String s2 = "Wang is a teacher";
		System.out.println(s1);
		String s3 = new String("John");
		System.out.println(s3);
		//Java defined data has a lot of functions available
		System.out.println(s2.charAt(5)); //index start from 0
		System.out.println(s2.length());
		System.out.println(s2.substring(5, 7));
		
		//Developer defined data type, every user defined class is user defined data type
		HelloWorld h = new HelloWorld("David");
		System.out.println(h);
		h = new HelloWorld("John");
		System.out.println(h);
		Print p = new Print();
		System.out.println(p); // com.huaxia.davidci.Print@1246ca6 this is result is from default toString() method.
		}

}
