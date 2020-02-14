package com.java8.date.api;

import java.time.LocalDateTime;
import java.time.Month;

public class RepresentParticularDateAndTime {

	public static void main(String[] args) {
		
		LocalDateTime localDateTime=LocalDateTime.of(1995, Month.APRIL, 23, 04, 55,20,782);
		System.out.println(localDateTime);
		System.out.println("==================");
		
		System.out.println("After five months :"+localDateTime.plusMonths(5));
		System.out.println("====================");
		System.out.println("Before four months:"+localDateTime.minusMonths(4));
	}
}
