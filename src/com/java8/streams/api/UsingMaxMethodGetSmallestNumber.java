package com.java8.streams.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class UsingMaxMethodGetSmallestNumber {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(-18,9,0,25,4);
		
		 // Using stream.max() to get maximum 
        // element according to provided Comparator 
        // Here, the smallest element in list 
        // will be stored in variable var 
		Optional<Integer> MIN=list.stream().max(Comparator.reverseOrder());
		
		if(MIN.isPresent()) {
			System.out.println(MIN.get());
		}else {
			System.out.println("NULL");
		}
	}
}
