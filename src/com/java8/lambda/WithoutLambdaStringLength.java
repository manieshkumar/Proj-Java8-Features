package com.java8.lambda;

interface O{

	public int getLength(String str);
}

class Demo1 implements O{
	@Override
	public int getLength(String str) {
		return str.length();
	}
}

public class WithoutLambdaStringLength {

	public static void main(String[] args) {
		
		O o=new Demo1();
		System.out.println(o.getLength("Hello"));
	}
}
