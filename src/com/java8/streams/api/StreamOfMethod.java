package com.java8.streams.api;

import java.util.stream.Stream;

public class StreamOfMethod {

	/*
	 * Stream of(T t) returns a sequential Stream containing a single element i.e, a
	 * singleton sequential stream. A sequential stream work just like for-loop
	 * using a single core. On the other hand, a Parallel stream divide the provided
	 * task into many and run them in different threads, utilizing multiple cores of
	 * the computer.
	 * 
	 * static <T> Stream<T> of(T t)
	 * 
	 * Where, Stream is an interface and T is the type of stream elements. t is the
	 * single element and the function returns a singleton sequential stream.
	 */
	public static void main(String[] args) {

		Stream<Integer> s = Stream.of(99, 999, 9999, 99999);
		s.forEach(System.out::println);

		Double[] d = { 10.0, 10.1, 10.2, 10.3 };
		Stream<Double> stream1 = Stream.of(d);
		System.out.println("===================");
		stream1.forEach(System.out::println);
	}
}
