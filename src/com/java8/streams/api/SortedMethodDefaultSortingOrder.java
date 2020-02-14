package com.java8.streams.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethodDefaultSortingOrder {

	public static void main(String[] args) {

		ArrayList<String> al1 = new ArrayList<>();
		al1.add("Montu");
		al1.add("Jhontu");
		al1.add("babu");

		List<String> l2 = al1.stream().sorted().collect(Collectors.toList());
		System.out.println("According to default natural sorting order :" + l2);

		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(6);
		al2.add(3);
		al2.add(8);

		List<Integer> l3 = al2.stream().sorted().collect(Collectors.toList());
		System.out.println("According to default natural sorting order :" + l3);

	}
}
