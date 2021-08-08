package com.huaxia.test;

import com.huaxia.davidci.Occupation;
import com.huaxia.davidci.SimpleClass1;
import com.huaxia.davidci.SimpleClass3;
import com.huaxia.davidci.Teacher;

public class Test {
	
	
	public static void test(String[] args) {
		SimpleClass1 sc1 = new SimpleClass1(); // create instance of SimpleClass1 by default contrustor
		System.out.println(sc1);
		System.out.println(sc1.getClass().getName());
		SimpleClass3 sc2 = new SimpleClass3("John");
		System.out.println(sc2);
		System.out.println(sc2.getClass().getName());
		

	}
	 
	 public static void main(String[] args) {
//       Occupation oc = new Occupation(); //cannot instantiate interface 
//		 Occupation oc1 = new Person("John");//Cannot instantiate abstract class
//		 System.out.println(oc1);
//		 Occupation oc2 = new Person("David");
//		 System.out.println(oc2);
//		 System.out.println();
//		 System.out.println("Occupation from Person: " + oc2.getOccupation());
		 Occupation oc3 = new Teacher("John");
		 System.out.println(oc3);
		 System.out.println("Occupation from Teacher: " + oc3.getOccupation());
		 System.out.println(oc3 instanceof Teacher); //oc3 is defined as occupation and not called add(
		 System.out.println(((Teacher)oc3).add(3.4, 6.5)); // run method defined in teacher
		 System.out.println(((Teacher)oc3).add(4, 5)); // run method defined in Person
		 System.out.println(oc3.getClass().getName());
	 }
	 public static void man(String[] args) {
		 
	 }
}
