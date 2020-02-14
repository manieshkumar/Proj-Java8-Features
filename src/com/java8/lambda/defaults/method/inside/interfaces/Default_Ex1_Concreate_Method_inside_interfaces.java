package com.java8.lambda.defaults.method.inside.interfaces;

interface I1{
	default void m1() {
		System.out.println("default method m1..");
	}
	default void m2() {
		System.out.println("default method m2..");
	}
}

public class Default_Ex1_Concreate_Method_inside_interfaces implements I1{

	@Override
	public void m1() {
		
		System.out.println("My own method implementation");
	}
	
	public static void main(String[] args) {
		
		
		Default_Ex1_Concreate_Method_inside_interfaces t=new Default_Ex1_Concreate_Method_inside_interfaces();
		t.m1();
		t.m2();
	}
	
}
