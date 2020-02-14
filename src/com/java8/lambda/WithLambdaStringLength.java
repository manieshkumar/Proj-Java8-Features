package com.java8.lambda;
@FunctionalInterface
interface L{
	public int getLength(String str);
}
public class WithLambdaStringLength {

	public static void main(String[] args) {
		
		L l=s->s.length();
		System.out.println(l.getLength("hello"));
	}
}
