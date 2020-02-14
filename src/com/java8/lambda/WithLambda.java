package com.java8.lambda;

@FunctionalInterface
interface I {

	public void m1();

}

public class WithLambda {

	public static void main(String[] args) {
		
		I i=()->System.out.println("m1() method implementation");
		i.m1();
	}
}
