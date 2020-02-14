package com.java8.preDefined.Functional.Interface;

import java.util.function.Supplier;

/*Supplier<R>{
	R get();
}
*/

public class SupplierFunctionalInterface {

	public static void main(String[] args) {

		Supplier<String> s=()->{
			String[] s1= {"no","jo","lizze","john"};
			int x=(int) (Math.random()*3+1);
			return s1[x];
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}
}
