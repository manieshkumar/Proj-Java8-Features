package com.java8.lambda.statics.method.overriding.issue;

//note: IN generall we can reduce the scope of access modifier but here in this case we will not 
//get any error

interface D{
	public static void m1() {
		System.out.println("m1() method from D interface");
	}
}
public class ChangingModifer implements D {
	
	private static void m1() {
		System.out.println("m1() method from ChangingModifer interface");
	}
	
	public static void main(String[] args) {
		ChangingModifer cm=new ChangingModifer();
		cm.m1();
		
		D.m1();
		
	}
	
	
}
