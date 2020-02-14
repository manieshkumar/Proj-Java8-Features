package com.java8.date.api.zone;

import java.time.ZoneId;

public class RepresentZone {

	//ZoneId object can be used to represent Zone
	public static void main(String[] args) {
		
		ZoneId zone=ZoneId.systemDefault();
		System.out.println(zone);
		
	}
}
