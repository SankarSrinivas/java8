package com.ss.learn.java8.lambda;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class TestFindIntInIntArray {

    public static void main(String[] args) {

        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Java 8
        boolean result = IntStream.of(number).anyMatch(x -> x == 4);

        if (result) {
            System.out.println("Hello 4");
        } else {
            System.out.println("Where is number 4?");
        }

        long[] lNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};

        boolean result2 = LongStream.of(lNumber).anyMatch(x -> x == 10);

        if (result2) {
            System.out.println("Hello 10");
        } else {
            System.out.println("Where is number 10?");
        }

    }
}
