package com.java.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeApiCode {
		
//  LocalDate
//	LocalTime
//	LocalDateTime
//	Period
//	Year
//	ZoneId
//	ZoneDateTime
		
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();
		
		System.out.printf("%d-%d-%d",dd,mm,yy);
		System.out.println();
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime );
		
		ZoneId z = ZoneId.systemDefault();
		System.out.println(z);
		
		ZoneId zi = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zdt = ZonedDateTime.now(zi);
		System.out.println(zdt);
		
	}

}
