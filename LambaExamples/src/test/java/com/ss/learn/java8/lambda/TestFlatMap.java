package com.ss.learn.java8.lambda;

import java.util.stream.Stream;

public class TestFlatMap {

	public static void main(String[] args) {
		
		Integer[] firstArray = new Integer[] { 1, 2};
		Integer[] secondArray = new Integer[] { 3, 4,5};
		Integer[] thirdArray = new Integer[] { 6,7,8,9};

		Stream<Integer[]> intArrayStream = Stream.of(firstArray, secondArray, thirdArray);
		Stream<Integer> result = intArrayStream.flatMap(Stream::of);
		
		intArrayStream.forEach(System.out::println);;
	}

}
