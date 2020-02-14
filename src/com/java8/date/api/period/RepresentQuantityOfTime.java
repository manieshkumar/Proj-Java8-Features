package com.java8.date.api.period;

import java.time.LocalDate;
import java.time.Period;

public class RepresentQuantityOfTime {

	public static void main(String[] args) {
		
		//how to calculate the period  like gap 
		LocalDate date=LocalDate.now();
		LocalDate birthday=LocalDate.of(1990, 05, 25);
		
		//now use class to find the difference
		Period p=Period.between(date, birthday);
		System.out.println("age is :"+p.getYears()+"Years"+p.getMonths()+"months"+p.getDays()+"days");
	}
}
