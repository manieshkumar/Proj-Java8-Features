package com.java8.streams.api;

import java.util.Arrays;
import java.util.List;

public class MaxMethod {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(-18,-9,0,25,4);
		
		Integer var=list.stream().max(Integer::compare).get();
		System.out.println(var);
	}
}
