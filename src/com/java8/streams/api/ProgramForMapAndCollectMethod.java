package com.java8.streams.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramForMapAndCollectMethod {

	public static void main(String[] args) {
		
		ArrayList<String> l1=new ArrayList<>();
		l1.add("dvc");
		l1.add("development");
		l1.add("team");
		
		List<String> l2=l1.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l2);
	}
}
