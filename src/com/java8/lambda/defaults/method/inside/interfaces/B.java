package com.java8.lambda.defaults.method.inside.interfaces;

public interface B {

	default void m1() {
		System.out.println("B interface m1() method..");
	}
}
