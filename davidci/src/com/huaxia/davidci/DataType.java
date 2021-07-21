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
		
	}

}
