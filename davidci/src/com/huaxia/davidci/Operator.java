package com.huaxia.davidci;

public class Operator {

	public static void main(String[] args) {
		// arithmetic operator: +, -, *, /, %
		int a, b, c;
		a = 15;
		b = 6;
		c = a + b;
		System.out.printf("%d + %d = %d\n", a, b, c);
		c = a - b;
		System.out.printf("%d - %d = %d\n", a, b, c);
		c = a * b;
		System.out.printf("%d × %d = %d\n", a, b, c);
		c = a / b;
		System.out.printf("%d ÷ %d = %d\n", a, b, c);
		c = a % b;
		System.out.printf("%d %% %d = %d\n", a, b, c);

		// assignment operator: =, +=, -=, *=, /=, %=
		// all of the assign operator has lowest priority
		double d = 3.1415;
		d += a; // is equivalent d = d + a
		d -= b;
		d *= c; // d = d * c
		d /= a;
		d %= a;
		System.out.println(d);

		// binary operator: ++, --, increase or decrease the variable value by 1
		int i = 0;
		a = i++; // assign i to a, then increase i by 1;
		a = ++i; // increase i by 1 first then assign i to a;
		System.out.println(a + " " + i);
		b = i--;
		System.out.println(b + " " + i);

		// comparison operator: >, <, >=, <=, ==, !=, always return boolean which are
		// true or false
		// compare two primitive data
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		// compare two String
		String s1 = "John"; // "John" is a constant
		String s2 = "John";
		System.out.println(s1 == s2);
		boolean x = s1 == s2; // == operator has higher priority the = operator
		System.out.println(x);
		// logical operator: && and, || or, ! not; return only true or false
		int y = 5;
		x = y > 4 && y < 10; // && will return true only both side are true
		System.out.println(x);
		x = y > 1 || y < 4; // || will return false only both side are false
		System.out.println(x);
		x = !(y > 2);
		System.out.println(x);

		// ternary operator: combination of ? and :, which separate the expression into
		// 3 parts,
		// and return a value based on the condition
		a = 5;
		b = 16;
		int min = a < b ? a : b; // return a if the boolean is true, or return b
		System.out.println("minimum of a and b is " + min);
		int max = a < b ? b : a;
		max = a > b ? a : b;
		System.out.println("max of a and b is " + max);

		// bitwise operator:
		// &: bitwise and
		// |: bitwise or
		// ^: bitwise xor
		// ~: bitwise compliment
		byte b1 = 0b00111100; // 8 bits = 1 byte
		System.out.println(formatByte(b1) + " &");
		byte b2 = 0b00001101;
		System.out.println(formatByte(b2) + " =");
		byte b3 = (byte) (b1 & b2); // force the result to be byte
		System.out.println(formatByte(b3));
		System.out.println(b1 + "&" + b2 + "=" + b3);
		System.out.println();

		System.out.println(formatByte(b1) + " |");
		System.out.println(formatByte(b2) + " =");
		b3 = (byte) (b1 | b2);
		System.out.println(formatByte(b3));
		System.out.println(b3);
		System.out.println();

		System.out.println(formatByte(b1) + " ^");
		System.out.println(formatByte(b2) + " =");
		b3 = (byte) (b1 ^ b2); // ^ return 0 if both are same, or 1 if they are different
		System.out.println(formatByte(b3));
		System.out.println(b3);
		System.out.println();

		System.out.println(formatByte(b1) + " ~");
		b3 = (byte) (~b1); // ~ toggle each bit to opposite value
		System.out.println(formatByte(b3).substring(24, 32));
		System.out.println(b3);

	}

	static String formatByte(byte b) {
		String s = String.format("%8s", Integer.toBinaryString(b));
		return s.replace(' ', '0');
	}

}
