package com.java8.date.api.leap.year.check;

import java.time.Year;
import java.util.Scanner;

public class CheckLeapYearUsingJava8_Features {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the year :\t");
		int n=scn.nextInt();
		
		Year y=Year.of(n);
		
		if(y.isLeap()) {
			System.out.println("The following year is leap year :"+n);
		}else {
			System.out.println("The following year is not a leap year :"+n);
		}
		
		
		
		scn.close();
		
		
	}
}
