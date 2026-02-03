package com.java.DateAndTimeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdExample {

	public static void main(String[] args) {
		ZoneId zone = ZoneId.systemDefault();
		System.out.println("ZoneID : " + zone);
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zn = ZonedDateTime.now(la);
		System.out.println("Zone of america :" + zn);

	}

}
