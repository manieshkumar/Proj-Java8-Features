package com.java8.date.api.UserDefinedDateFormat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateFormattterUserDefinfedTypeUsingJava8 {

	public static void main(String[] args) {
		
		//input="2017-01-18 20:10:00"
		Scanner scn=new Scanner(System.in);
		//Enter the date and time which you want to format
		System.out.println("Enter the date and time which you want to format : ");
		String input=scn.nextLine();
		String output;
		
		//here we are using DateTimeFormatter to format the date 
		DateTimeFormatter oldPattern=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		DateTimeFormatter newPattern=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		LocalDateTime dateTime=LocalDateTime.parse(input, oldPattern);
		
		output=dateTime.format(newPattern);
		System.out.println(output);
		
		scn.close();
	}
}
