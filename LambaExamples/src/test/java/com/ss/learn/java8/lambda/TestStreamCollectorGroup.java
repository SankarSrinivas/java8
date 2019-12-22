package com.ss.learn.java8.lambda;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.ss.learn.java8.lambda.domain.Item;

public class TestStreamCollectorGroup {

	public static void main(String[] args) {

        //countDistinctEntriesInList();
        //countDistinctEntriesInListAndSort();
        groupByAndCalculateSum();
	}

	private static void groupByAndCalculateSum() {
        //3 apple, 2 banana, others 1
        List<Item> items = Arrays.asList(
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 20, new BigDecimal("19.99")),
                new Item("orang", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 10, new BigDecimal("19.99")),
                new Item("apple", 20, new BigDecimal("9.99"))
        );

        Map<String, Long> counting = items.stream().collect(
                Collectors.groupingBy(Item::getName, Collectors.counting()));

        System.out.println(counting);

        Map<String, Integer> sum = items.stream().collect(
                Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));
        System.out.println(sum);
        
        Map<String, Double> sumPrice = items.stream().collect(
        		Collectors.groupingBy(Item::getName, Collectors.summingDouble(item->item.getPrice().doubleValue())));

        System.out.println(sumPrice);
	
	}

	private static void countDistinctEntriesInListAndSort() {
		
		//3 apple, 2 banana, others 1
		List<String> items =
				Arrays.asList("apple", "apple", "banana",
						"apple", "orange", "banana", "papaya");
		
		Map<String, Long> result =
				items.stream().collect(
						Collectors.groupingBy(
								Function.identity(), Collectors.counting()
								)
						);
		
		Map<String, Long> finalMap = new LinkedHashMap<>();
		
		//Sort a map and add to finalMap
		result.entrySet().stream()
		.sorted(Map.Entry.<String, Long>comparingByValue()
				.reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
		
		System.out.println(finalMap);	
	}

	private static void countDistinctEntriesInList() {
		//3 apple, 2 banana, others 1
        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");

        Map<String, Long> result =
                items.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );

        System.out.println(result);
	}
}
