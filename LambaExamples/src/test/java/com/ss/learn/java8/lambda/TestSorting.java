package com.ss.learn.java8.lambda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.ss.learn.java8.lambda.domain.Developer;

public class TestSorting {

	public static void main(String[] args) {

		List<Developer> listDevs = getDevelopers();

		// Old way for processing list 
		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}

		// Sort by Name	using Java 8 Lambda
		listDevs.sort((Developer o1, Developer o2)->o1.getName().compareTo(o2.getName()));
		
		// Sort by Age	
		//listDevs.sort((Developer o1, Developer o2)->o1.getAge().compareTo(o2.getAge()));
		
		// Sort by Salary	
		//listDevs.sort((Developer o1, Developer o2)->o1.getSalary().compareTo(o2.getSalary()));
		
		System.out.println("After Sort");
		// Java 8 way of iterating list
		listDevs.forEach((Developer d)->System.out.println(d.toString()));
	}

	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("Sankar", new BigDecimal("70000"), 33));
		result.add(new Developer("Rama", new BigDecimal("80000"), 20));
		result.add(new Developer("John", new BigDecimal("100000"), 10));
		result.add(new Developer("Jane", new BigDecimal("170000"), 55));
		
		return result;

	}
}
