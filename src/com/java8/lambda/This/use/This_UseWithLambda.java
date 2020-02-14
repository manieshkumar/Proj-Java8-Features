package com.java8.lambda.This.use;
interface U{
	public void m1();
}
public class This_UseWithLambda {

	int x=888;
	public void m2() {
		U u=()->{
			//local variable
			int x=999;
			System.out.println(this.x);
			System.out.println(x);
			//System.out.println(This_UseWithLambda.this.x);
		};
		u.m1();
	}
	public static void main(String[] args) {
		
		This_UseWithLambda tuwl=new This_UseWithLambda();
		tuwl.m2();
	}
}
