package com.ss.learn.java8.lambda;

public class TestConvertStringArrayToCharStream {

    public static void main(String[] args) {

        String password = "password123";

        password.chars() //IntStream
                .mapToObj(x -> (char) x)//Stream<Character>
                .forEach(System.out::println);

    }
}
