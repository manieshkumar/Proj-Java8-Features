package com.java8.lambda.funtionalInterface.wrt.inheritance;

@FunctionalInterface
interface B{
	public void m1();
}

@FunctionalInterface
public interface C extends B {

	public void m1();
}
