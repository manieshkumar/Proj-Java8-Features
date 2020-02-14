package com.java8.lambda.defaults.method.inside.interfaces;

public class DefaultMethodIssueWithMultipleInheritance implements A, B {

	@Override
	public void m1() {
	//here we can't decide which m1() method will execute ambiguity problem
	}

	
}
