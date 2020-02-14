package com.java8.streams.api;

import java.util.Arrays;
import java.util.Optional;

public class ComparingStringBasedOnLastCharacter {

	public static void main(String[] args) {
		
		String[] array= {"Geeks", "for", "GeeksforGeeks", 
                "GeeksQuiz" };
		// The Comparator compares the strings 
        // based on their last characters and returns 
        // the minimum value accordingly.
		
		Optional<String> MIN=Arrays.stream(array).min((str1,str2)->Character.compare(str1.charAt(str1.length()-1), str2.charAt(str2.length()-1)));
		
		if(MIN.isPresent())	{
			System.out.println(MIN.get());
		}else {
			System.out.println("-1");
		}
		
	}
}
