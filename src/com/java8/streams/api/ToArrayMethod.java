package com.java8.streams.api;

import java.util.Arrays;
import java.util.stream.Stream;

public class ToArrayMethod {

	public static void main(String[] args) {
		
		//we can use toArray() to copy elements in the stream into specifies array
		
		/*
		 * Syntax : Object[] toArray()
		 */
		
		Stream<Integer> stream=Stream.of(5, 6, 7, 8, 9, 10);
		
		//System.out.println("stream::"+stream);
		
		Object[] arr=stream.toArray();
		
		//System.out.println(arr);
		
		System.out.println("from stream::"+Arrays.toString(arr));
		
		System.out.println("===============");
		Stream<Integer> stream1=Stream.of(9,10,11,12,13,14);
		
		Integer[] ir=stream1.toArray(Integer[]::new);
		for(Integer i:ir) {
			System.out.println(i);
		}
		
		
		// Creating a Stream of Strings 
        Stream<String> stream2 = Stream.of("Geeks", "for", 
                                          "Geeks", "GeeksQuiz"); 
  
        // Using Stream toArray() 
        Object[] arr1 = stream2.toArray(); 
  
        // Displaying the elements in array arr 
        System.out.println(Arrays.toString(arr1)); 
		
	}
}
