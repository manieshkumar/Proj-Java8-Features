package com.java8.lambda.defaults.method.inside.interfaces;

public class DefaultMethodIssueWithMultipleInheritanceAndSolution implements A, B {

	@Override
	public void m1() {
		// with only sopln() this implementation class method is getting executed
		System.out.println("m1() method..");
		// to run default method from A or B interface this below syntax will solve ambiguity problem
		A.super.m1();
		B.super.m1();
	}

	public static void main(String[] args) {
		DefaultMethodIssueWithMultipleInheritanceAndSolution d = new DefaultMethodIssueWithMultipleInheritanceAndSolution();
		d.m1();
	}

}
