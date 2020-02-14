package com.java8.lambda.funtionalInterface;

@FunctionalInterface
interface I7{
	public void m1();
	//public void m2();
	
	default void m2() {
		System.out.println("from default method..");
	}
	
	default void m4() {
		System.out.println("from default method..");
	}
	
	
	public static void m3() {
		System.out.println("from static method..");
	}
	
	public static void m5() {
		System.out.println("from static method..");
	}
	
}

public class FunctionalIntefaceAnnotation {

	public static void main(String[] args) {
		
		I7 i7=()->System.out.println("hello");
		i7.m1();
		i7.m2();
		I7.m3();
		i7.m4();
		I7.m5();
	}
}
