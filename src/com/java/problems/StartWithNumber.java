package com.java.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithNumber {
	
	/*find number start with 1*/
	public static void main(String[] args) {
		
		int[] number = {5,9,11,2,8,21,1};
		
		List<String> list = Arrays.stream(number)
				.boxed()
				.map(s->s+"")
				.filter(s->s.startsWith("1"))
				.collect(Collectors.toList());
		
		System.out.println(list);
		
		
	}

}
