package com.java8.date.api;

import java.time.LocalDate;

public class PrintDateMonthYear {

	public static void main(String[] args) {
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		//get date month and year separately by calling these method
		int dd=date.getDayOfMonth();
		int mm=date.getMonthValue();
		int yyyy=date.getYear();
		
		System.out.println(dd+"..."+mm+"..."+yyyy);
		
	}
}
