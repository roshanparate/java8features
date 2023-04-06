package com.java.problems;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountChar {

	/* find char and count of each char*/
	public static void main(String[] args) {
		String input = "iamsoftwareengineer";
		
		String[] charArr =  input.split("");
		
		Map<String, Long> mapStr = Stream.of(charArr)
										 .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(mapStr);
	}
}
