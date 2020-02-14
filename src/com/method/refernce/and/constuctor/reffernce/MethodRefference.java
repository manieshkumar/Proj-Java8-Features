package com.method.refernce.and.constuctor.reffernce;

//in method reffernce if the implementation is already provided somewhere in other method then just use it 
//don't implement it again.
//Adantage:-code reusablity
//compulsory both method should have same argument type
//lamda reference alernative is method reference

//if it is static
//className::methodName
//eg:Test::m2

//if it is not static then
//Object reference::methodName
//Test t=new Test();
//t::m2();
@FunctionalInterface
interface P {
	public void m1();
}

public class MethodRefference {

	public static void m2() {
		System.out.println("Method reffernce m2() method");
		//assume here there are many lines of code and i don't want to write the code again.

	}

	public static void main(String[] args) {
		P p = MethodRefference::m2;
		p.m1();
	}
}
