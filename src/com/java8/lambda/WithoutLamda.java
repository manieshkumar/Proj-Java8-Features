package com.java8.lambda;

@FunctionalInterface
interface U {

	public void m1();
}

class Demo implements U {
	@Override
	public void m1() {
		System.out.println("m1() method implementation");
	}
}

public class WithoutLamda {

	public static void main(String[] args) {
	
		U u=new Demo();
		u.m1();
	}
}
