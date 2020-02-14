package com.java8.lambda;

import java.util.ArrayList;

public class SimpleLambdaExpressionUsingCollection {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);

		// it will print the normal value
		al.forEach((n) -> System.out.println(n+"\t"));

		System.out.println("=============");
		// print only which is even
		al.forEach(n -> {
			if (n % 2 == 0) {
				System.out.println(n);
			}

		});
	}

}
