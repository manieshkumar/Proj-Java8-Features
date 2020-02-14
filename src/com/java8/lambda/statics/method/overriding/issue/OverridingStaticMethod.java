package com.java8.lambda.statics.method.overriding.issue;


//note:for interface static method overriding method is not applicable 
interface A{
	public static void m1() {
		System.out.println("m1() method from interface A..");
	}
}
public class OverridingStaticMethod implements A {
	//@Override
	//un-comment override one can see the error.
	public static void m1() {
		System.out.println("m1() method from interface A..");
	}
	
	

}
