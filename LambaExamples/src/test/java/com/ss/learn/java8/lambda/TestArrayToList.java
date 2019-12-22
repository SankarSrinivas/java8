package com.ss.learn.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestArrayToList {

	public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        IntStream intStream = Arrays.stream(number);
        Stream<Integer> boxed = intStream.boxed();
        List<Integer> list = boxed.collect(Collectors.toList());
        System.out.println("list : " + list);
	}


}
