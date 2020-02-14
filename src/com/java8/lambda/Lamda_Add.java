package com.java8.lambda;

interface I1{
	public int add(int a,int b);
}

public class Lamda_Add{
	public static void main(String[] args) {
		
		I1 i1=(a,b)->a+b;
		System.out.println("The sum of two number is ::"+i1.add(2, 4));
	}
	
}
