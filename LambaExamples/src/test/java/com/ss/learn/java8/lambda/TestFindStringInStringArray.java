package com.ss.learn.java8.lambda;

import java.util.Arrays;

public class TestFindStringInStringArray {

    public static void main(String[] args) {

        String [] strArray = new String[] {"Sankar", "Krishna", "Agustin" };
        
        boolean anyMatch = Arrays.stream(strArray).anyMatch("Rama"::equals);
        if (anyMatch) {
        	System.out.println("Rama found");
        } else {
        	System.out.println("Rama not found");
        }

    }
}
