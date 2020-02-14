package com.java8.date.api.zone;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class CreateZoneIdForParticularZone {

	public static void main(String[] args) {

		ZoneId zone = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zoneDateTime = ZonedDateTime.now(zone);
		System.out.println(zoneDateTime);
	}
}
