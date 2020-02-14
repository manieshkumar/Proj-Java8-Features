package com.java8.lambda.funtionalInterface.wrt.inheritance;

@FunctionalInterface
interface X {
	public void m1();
}

public interface Y extends X{

	public void m2();
}
