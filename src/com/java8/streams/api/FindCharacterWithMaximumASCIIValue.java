package com.java8.streams.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindCharacterWithMaximumASCIIValue {

	public static void main(String[] args) {
		
		// Creating a list of Strings 
        List<String> list = Arrays.asList("G", "E", "E", "K", 
                                          "g", "e", "e", "k"); 
        

        // using Stream.max() method with Comparator 
        // Here, the character with maximum ASCII value 
        // is stored in variable MAX
        String MAX=list.stream().max(Comparator.comparing(String::valueOf)).get();
        
        System.out.println("Maximum element in the "
                + "stream is : " + MAX); 
	}
}
