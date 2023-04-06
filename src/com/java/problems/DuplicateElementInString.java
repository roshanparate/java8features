package com.java.problems;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateElementInString {
 
	public static void main(String[] args) {
		String input = "iamsoftwareengineer";

		String[] charArr = input.split("");
		
		System.out.println(input);
		
		/*find duplicate char list from string*/
		List<String> mapStr = Stream.of(charArr)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(x -> x.getValue() > 1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());

		System.out.println(mapStr);
		
		/*find single char list from string*/
		List<String> mapStr1 = Stream.of(charArr)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(x -> x.getValue() == 1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());

		System.out.println(mapStr1);
		
		/*find first non-repeated char from string*/
		System.out.println(Stream.of(charArr)
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(x -> x.getValue() > 1)
				.findFirst().get().getKey()
				);
	}

}
