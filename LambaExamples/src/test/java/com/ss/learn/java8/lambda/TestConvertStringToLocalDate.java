package com.ss.learn.java8.lambda;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TestConvertStringToLocalDate {

	public static void main(String[] argv) {

		simpleParsingToLocalDate();

		parseUsingFormatter();
		
        parseDateUsingFormatter1();
        parseDateUsingFormatter2();
        parseDateUsingFormatter3();
        parseDateUsingZonedDate();

	}
	private static void parseDateUsingZonedDate() {

        String date = "2016-08-16T10:15:30+08:00";

        ZonedDateTime result = ZonedDateTime.parse(date, DateTimeFormatter.ISO_DATE_TIME);

        System.out.println("ZonedDateTime : " + result);

        System.out.println("TimeZone : " + result.getZone());

        LocalDate localDate = result.toLocalDate();

        System.out.println("LocalDate : " + localDate);		
		
	}
	private static void parseDateUsingFormatter3() {
		String dateInString = "2016-08-16T15:23:01Z";
		
		Instant instant = Instant.parse(dateInString);
		
		System.out.println("Instant : " + instant);
		
		//get date time only
		LocalDateTime result = LocalDateTime.ofInstant(instant, ZoneId.of(ZoneOffset.UTC.getId()));
		
		//get localdate
		System.out.println("LocalDate : " + result.toLocalDate());
		
		//get date time + timezone
		ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Asia/Tokyo"));
		System.out.println(zonedDateTime);
		
		//get date time + timezone
		ZonedDateTime zonedDateTime2 = instant.atZone(ZoneId.of("Europe/Athens"));
		System.out.println(zonedDateTime2);		
	}

	private static void parseDateUsingFormatter2() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm:ss a");

        String date = "Tuesday, Aug 16, 2016 14:10:56 PM";

        LocalDateTime localDateTime = LocalDateTime.parse(date, formatter);

        System.out.println(localDateTime);

        System.out.println(formatter.format(localDateTime));
	}

	private static void parseDateUsingFormatter1() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM d yyyy");

        String date = "Tuesday, Aug 16 2016";

        LocalDate localDate = LocalDate.parse(date, formatter);

        System.out.println(localDate);

        System.out.println(formatter.format(localDate));
	}

	private static void parseUsingFormatter() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");

		String date = "16-Aug-2016";

		LocalDate localDate = LocalDate.parse(date, formatter);

		System.out.println(localDate); // default, print ISO_LOCAL_DATE

		System.out.println(formatter.format(localDate));
	}

	private static void simpleParsingToLocalDate() {
		String date = "2016-08-16";

		// default, ISO_LOCAL_DATE
		LocalDate localDate = LocalDate.parse(date);

		System.out.println(localDate);
	}
}
