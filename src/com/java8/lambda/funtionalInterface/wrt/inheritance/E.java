package com.java8.lambda.funtionalInterface.wrt.inheritance;

@FunctionalInterface
interface D{
	public void m1();
}

@FunctionalInterface
public interface E extends D{
	
	//public void m2();//c.e
}
