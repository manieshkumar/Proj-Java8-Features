package com.java8.streams.api;

import java.util.Comparator;
import java.util.stream.Stream;

public class PerformPrintOperationOnEachElementOfReverselySortedStringStream {

	public static void main(String[] args) {

		// note one 1st index we are sorting

		Stream<String> stream = Stream.of("GFG", "Geeks", "for", "GeeksforGeeks");

		stream.sorted(Comparator.reverseOrder()).flatMap(str1 -> Stream.of(str1.charAt(1)))
				.forEach(System.out::println);
	}
}
