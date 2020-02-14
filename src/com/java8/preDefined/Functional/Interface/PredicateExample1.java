package com.java8.preDefined.Functional.Interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateExample1 {

//	there are some predefined fucntional intereface they are (1.8v)
//	Predicate(I)-> returns true or false based on some condition
//	Function(I)
//	Consumer(I)
//	Supplier(I)
//  defined in java.util.Function package

	// test()
	// interface Predicate<T>{
	// boolean test(T t);
	// }


	public static void main(String[] args) {

//		Predicate<Integer> p=I->I>10;
//		System.out.println(p.test(100));
//		System.out.println(p.test(5));
//		
//		Predicate<String> p1=S->S.length()>5;
//		System.out.println(p1.test("jhonathan"));
//		System.out.println(p1.test("jhoan"));
		
		Predicate<Collection<String>> p2=c->c.isEmpty();
		ArrayList<String> al=new ArrayList<>();
		al.add("A");
		System.out.println(p2.test(al));
		ArrayList<String> al1=new ArrayList<>();
		System.out.println(p2.test(al1));
		
		
	}
}
