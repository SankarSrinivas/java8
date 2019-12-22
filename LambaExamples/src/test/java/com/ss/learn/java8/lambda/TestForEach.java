package com.ss.learn.java8.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestForEach {

	public static void main(String[] args) {

		//iterateMap();
		iterateList();
	}

	private static void iterateMap() {
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		// Iterate through all items and execute one statement
		items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
		System.out.println("");
		
		// Iterate through all items and execute multiple statements
		items.forEach((k,v)->{
			System.out.println("Item : " + k + " Count : " + v);
			if("E".equals(k)){
				System.out.println("Hello E");
			}
		});
	}
	private static void iterateList() {
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		//lambda
		//Output : A,B,C,D,E
		items.forEach(item->System.out.println(item));
		System.out.println(" Executed each statement for each entry");
			
		//Output : C
		items.forEach(item->{
			if("C".equals(item)){
				System.out.println(item);
			}
		});
			
		System.out.println(" Executed each statement in a block with a condition");
		//method reference
		//Output : A,B,C,D,E
		items.forEach(System.out::println);
		System.out.println(" Executed each statement using method reference with the entry as a parameter");
		
		//Stream and filter
		//Output : B
		items.stream()
			.filter(s->s.contains("B"))
			.forEach(System.out::println);
	}
}
