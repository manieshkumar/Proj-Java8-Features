package com.java8.date.api.zone;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class ConvertCurrentDateAndTimeToAnotherZone {

	public static void main(String[] args) {

		// get all the zones
		Set<String> allZones = ZoneId.getAvailableZoneIds();
		// System.out.println(allZones);

		// now store it in list
		List<String> zoneList = new ArrayList<String>(allZones);
		// System.out.println(zoneList);

		// now sort the the list
		Collections.sort(zoneList);

		// create LocalDateTime Object and get the current date and time
		LocalDateTime ldt = LocalDateTime.now();

		// now we are iterating the each zone and storing it in ZoneId object
		for (String s : zoneList) {

			ZoneId zoneid = ZoneId.of(s);
			//System.out.println(zoneid);
			
			//now create ZonedDateTime object and store their date and time in that object
			ZonedDateTime zdt=ldt.atZone(zoneid);
			//System.out.println(zdt);
			
			//now create an offset object it will give the diff for zone means how much time it is ahead
			/*
			 * Parse string to OffsetDateTime in UTC In this example, timestamp represents
			 * one instant at "+05:30" offset. Java program to convert string to
			 * OffsetDateTime and get equivalent instant in UTC. 'Z' in date string
			 * represents the UTC timezone. It is short form of Zulu and can be written as
			 * UTC +0:00 . 
			 */
			ZoneOffset offset=zdt.getOffset();
			//System.out.println(offset);
			
			 String out = String.format("%35s %10s%n", zoneid, offset);
			 System.out.println(out);
			
		}

	}
}
