package com.java8.lambda.This.use;

interface M1{
	public void m1();
}

public class This_UseWithoutLambda {

	int x=888;
	public void m2() {
		M1 m1=new M1() {
			int x=999;
			public void m1() {
				System.out.println(this.x);
				System.out.println(This_UseWithoutLambda.this.x);
			}
		};
		m1.m1();
	}//m2()
	public static void main(String[] args) {
		
		This_UseWithoutLambda tuwl=new This_UseWithoutLambda();
		tuwl.m2();
	}
	
}
