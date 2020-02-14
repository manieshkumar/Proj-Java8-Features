package com.java8.preDefined.Functional.Interface;

import java.util.function.Predicate;

public class PredicateJoining {

	/*
	 * negate(), and(), or()- the above three are default method addded in the
	 * predicate(I)
	 */
	
	public static void m1(Predicate<Integer> p,int[] x) {
		for(int x1:x) {
			if(p.test(x1)) {
				System.out.println(x1);
			}
		}
		
	}
	public static void main(String[] args) {

		int[] x= {0,5,10,15,20,25,30};
		Predicate<Integer> p1=i->i>10;
		Predicate<Integer> p2=i->i%2==0;
		System.out.println("The Number greater then 10 is:");
		m1(p1,x);
		System.out.println("The even numbers are:");
		m1(p2,x);
		System.out.println("The number not greater than 10");
		m1(p1.negate(),x);
		System.out.println("The number greater then 10 and even");
		m1(p1.and(p2),x);
		System.out.println("The number greater then 10 or even");
		m1(p1.or(p2),x);
		
	}
}
