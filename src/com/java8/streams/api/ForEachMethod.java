//This method will not return anything
//This method will take lamda expression as an argument and apply the lamda expression
//for each element present in the stream
/*
 * Stream forEach() method in Java with examples Stream forEach(Consumer action)
 * performs an action for each element of the stream. Stream forEach(Consumer
 * action) is a terminal operation i.e, it may traverse the stream to produce a
 * result or a side-effect.
 * 
 * Syntax :
 * 
 * void forEach(Consumer<? super T> action)
 * 
 * Where, Consumer is a functional interface and T is the type of stream
 * elements. Note : The behavior of this operation is explicitly
 * nondeterministic. Also, for any given element, the action may be performed at
 * whatever time and in whatever thread the library chooses.
 */

package com.java8.streams.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ForEachMethod {

	public static void main(String[] args) {

		List<Integer> list=Arrays.asList(-18,-9,0,25,4);
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
