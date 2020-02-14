package com.java8.streams.api;

import java.util.Arrays;
import java.util.List;

public class MinMethod {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(-9,-18,0,25,4);
		
		Integer var=list.stream().min(Integer::compare).get();
		System.out.println(var);
		
	}
}
