package com.java8.date.api;

import java.time.LocalTime;

public class PrintTime_Hr_Min_Sec_NanoSec {

	public static void main(String[] args) {
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		int hr=time.getHour();
		int min=time.getMinute();
		int sec=time.getSecond();
		int nanoSec=time.getNano();
		
		System.out.println("================");
		
		System.out.println(hr+":"+min+":"+sec+":"+nanoSec);
	}
}
