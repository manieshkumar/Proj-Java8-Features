package com.java8.lambda;

@FunctionalInterface
interface I6 {
	public void m1();
	// public void m2();
}

public class SingleStatement_MultipleStatement {

	public static void main(String[] args) {
	
		I6 i6=()->System.out.println("hello");
		i6.m1();
		
		System.out.println("============");
		I6 i61=()->{System.out.println("hello");
					System.out.println("matt");
					if("hello" != null) {
						System.out.println("welcome");
					}
		};
					i61.m1();
	}
}
