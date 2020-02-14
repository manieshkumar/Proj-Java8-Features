package com.java8.preDefined.Functional.Interface;

import java.util.function.Function;

//it can return any value 
//predicate can return only boolean value
//interface Function<T,R>{
//R apply(T t);
//}
public class Functions {

	public static void main(String[] args) {

		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("hello"));
		System.out.println(f.apply("Aeroplane"));

		Function<Integer, Integer> f1 = i -> i * i;
		System.out.println(f1.apply(5));
	}
}
