package com.ss.learn.java8.lambda;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class TestConvertStringToLocalDateTimeUsingInstant {


    public static void main(String[] argv) {

        String dateInString = "2014-10-05T15:23:01Z";

        Instant instant = Instant.parse(dateInString);

        System.out.println(instant);

        //get date time only
        LocalDateTime result = LocalDateTime.ofInstant(instant, ZoneId.of(ZoneOffset.UTC.getId()));

        System.out.println(result);

        //get date time + timezone
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("-05:00"));
        System.out.println(zonedDateTime);

        //get date time + timezone
        ZonedDateTime zonedDateTime2 = instant.atZone(ZoneId.of("Asia/Kolkata"));
        System.out.println(zonedDateTime2);
        
    }
}
