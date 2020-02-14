package com.java8.lambda.statics.method;

interface O{
	public static void m1() {
		System.out.println("m1() static method from O interface..");
	}
}
public class StaticMethodExample implements O {
	
	public static void main(String[] args) {
		
		//Note: by default implementation class method will be available if we are implementing that inteface and then 
		//we are calling using that interface reference.(But in this scenario we will get error)
		//O o=new StaticMethodExample();
		//o.m1();
		
		//By using Implementation className.method() will also give error error but if it is not static 
		// then we can easily access it
		//StaticMethodExample.m1();
		
		//correct way
		O.m1();
	}

}
