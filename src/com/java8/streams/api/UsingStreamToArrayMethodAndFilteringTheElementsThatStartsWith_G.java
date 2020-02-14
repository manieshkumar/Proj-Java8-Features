package com.java8.streams.api;

import java.util.stream.Stream;

public class UsingStreamToArrayMethodAndFilteringTheElementsThatStartsWith_G {

	public static void main(String[] args) {
		// Creating a Stream of Strings
		Stream<String> stream = Stream.of("Geeks", "for", "gfg", "GeeksQuiz");

		// Using Stream toArray() and filtering
		// the elements that starts with 'G'

		String[] str = stream.filter(str1->str1.startsWith("G")).toArray(String[]::new);
		for (String str1 : str) {
			System.out.println(str1);
		}
	}
}
