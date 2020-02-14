package com.java8.date.api;

import java.time.LocalDateTime;

public class RepresentBothDateAndTime {

	public static void main(String[] args) {
		
		//To represent both local date and time then onlu we 
		LocalDateTime localDateTime=LocalDateTime.now();
		System.out.println(localDateTime);
		
		//date value individually
		int dd=localDateTime.getDayOfMonth();
		int mm=localDateTime.getMonthValue();
		int yyyy=localDateTime.getYear();
		
		//time value individually
		
		int hr=localDateTime.getHour();
		int min=localDateTime.getMinute();
		int sec=localDateTime.getSecond();
		int nanoSec=localDateTime.getNano();
		
		System.out.println("The date and time is:-\n Date :"+dd+"/"+mm+"/"+yyyy+"\n Time :\t"+hr+":"+min+":"+sec+":"+nanoSec);
		
		
	}
}
