package com.java8.lambda.statics.method.overriding.issue;

interface C{
	public static void m1() {
		System.out.println("mi() method C interface");
	}
}

public class IfNotImplementingSameMethod implements C {

	//note generally in normal java class we will get C.E error because parent method is not matching the
	//child.so in this case we don't get error because there is not concept of overriding
	
	
	public void m1() {
		System.out.println("m1() method from IfNotImplementingSameMethod");
	}
}
