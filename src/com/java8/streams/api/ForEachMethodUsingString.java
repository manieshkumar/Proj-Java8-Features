package com.java8.streams.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ForEachMethodUsingString {

	public static void main(String[] args) {
		// Creating a list of Strings 
        List<String> list = Arrays.asList("HFG", "Geeks", 
                                          "For", "GeeksforGeeks");
        
        // Using forEach(Consumer action) to 
        // print the elements of stream 
        
        System.out.println("In reverse order/descending::");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        
        System.out.println("In natural order/ascending::");
        list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
	}
}
