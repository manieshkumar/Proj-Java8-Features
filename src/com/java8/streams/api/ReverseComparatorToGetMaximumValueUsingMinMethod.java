package com.java8.streams.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ReverseComparatorToGetMaximumValueUsingMinMethod {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(-18,-9,0,25,4);
		
		Optional<Integer> var=list.stream().min(Comparator.reverseOrder());
		if(var.isPresent()) {
			System.out.println(var.get());
		}else {
			System.out.println("NULL");
		}
	}
}
