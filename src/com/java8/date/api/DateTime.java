package com.java8.date.api;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTime {

	public static void main(String[] args) {
		
		//create local-date instance
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		System.out.println("======================");
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
	}
}
