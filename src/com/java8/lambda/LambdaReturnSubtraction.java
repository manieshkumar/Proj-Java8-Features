package com.java8.lambda;

interface I5{
	public int subtractiobn(int a,int b);
}

public class LambdaReturnSubtraction {

	
	public static void main(String[] args) {
		
		//1st way
		I5 sub=(a,b)->{return (a-b);};
		System.out.println("with return this is how we write"+sub.subtractiobn(10, 9));
		
		//2nd way
		I5 sub1=(a,b)->a-b;
		System.out.println("we can skip return keyword also"+sub1.subtractiobn(10, 9));
		
	}
}
