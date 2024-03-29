package com.ss.learn.java8.lambda;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneOffset;

public class TestInstantToLocalTimeAndViceVersa {

    public static void main(String[] argv) {

		instantToLocalDateTime();
		localDateTimeToInstant();

    }

	private static void localDateTimeToInstant() {
		// Hard code a date time
        LocalDateTime dateTime = LocalDateTime.of(2016, Month.AUGUST, 18, 6, 17, 10);

        System.out.println("LocalDateTime : " + dateTime);

        // Convert LocalDateTime to Instant, UTC+0
        Instant instant = dateTime.toInstant(ZoneOffset.UTC);

        System.out.println("Instant : " + instant);		
	}

	private static void instantToLocalDateTime() {
		// Parse a ISO 8601 Date directly
		//Instant instant = Instant.parse("2016-08-18T06:17:10.225Z");

        Instant instant = Instant.now();

        System.out.println("Instant : " + instant);

        //Convert instant to LocalDateTime, no timezone, add a zero offset / UTC+0
        LocalDateTime ldt = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);

        System.out.println("LocalDateTime : " + ldt);
	}


}
