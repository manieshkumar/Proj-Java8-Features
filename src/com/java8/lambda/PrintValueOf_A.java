package com.java8.lambda;

interface I4{
	public void value(int a);
}
public class PrintValueOf_A {

	public static void main(String[] args) {
		//one way
		I4 i4=(a)->System.out.println(a);
		i4.value(6);
		
		//second way
		I4 i41=a->System.out.println(a);
		i41.value(7);
	}
	
	
}
