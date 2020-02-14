package com.java8.streams.api;

import java.util.ArrayList;

public class CountMethod {

public static void main(String[] args) {
		
		ArrayList<String> l1=new ArrayList<>();
		l1.add("dvc");
		l1.add("development");
		l1.add("team");
		
		long count=l1.stream().count();
		System.out.println(count);
		
		long countBasedOnCondtion=l1.stream().filter(s->s.length()>=4).count();
		System.out.println(countBasedOnCondtion);
	}
}
