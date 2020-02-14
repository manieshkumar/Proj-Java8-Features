package com.java8.streams.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethodCustomisedSortingOrder {

	public static void main(String[] args) {

		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(7);
		al1.add(2);
		al1.add(5);

		System.out.println(al1);

		List<Integer> l1 = al1.stream().sorted((a, b) -> a.compareTo(b)).collect(Collectors.toList());
		System.out.println(l1);

		ArrayList<String> al2 = new ArrayList<>();
		al2.add("nora");
		al2.add("Nazmi");
		al2.add("jamil");
		al2.add("Amar");

		System.out.println(al2);

		// Ascending order based on Ascii value it is arranging
		List<String> l2 = al2.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(l2);

		// descending order based on Ascii value it is arranging
		List<String> l3 = al2.stream().sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println(l3);
	}
}
