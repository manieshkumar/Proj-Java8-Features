package com.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class LamdaSortingInCollectionUsing {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(205, 875, 425, 123, 159, 635, 45, 0, 9);
		System.out.println("Before Sorting::" + list);

		// now we are sorting using collection
		Collections.sort(list, (o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
		System.out.println("Elements After sorting::" + list);

		TreeSet<Integer> ts = new TreeSet<Integer>((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
		ts.add(875);
		ts.add(235);
		ts.add(1080);
		ts.add(15);
		ts.add(5);

		System.out.println("Elements of the TreeSet after" + " sorting are: " + ts);
	}
}
