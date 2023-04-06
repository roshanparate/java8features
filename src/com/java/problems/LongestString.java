package com.java.problems;

import java.util.Arrays;

public class LongestString {

	public static void main(String[] args) {
		/* find longest string*/
		String[] strArray = {"java","hibernate","springboot","microservices", "docker","vfgjdhvshidvsaihdd oihbcjhasvchisagsqabjhvcsah jjbijusagc"};
		
		System.out.println("Longest String from array : "+
				Arrays.stream(strArray)
				.reduce((word1,word2) ->word1.length() > word2.length() ? word1 :word2)
				.get());                  
		
	}

}
