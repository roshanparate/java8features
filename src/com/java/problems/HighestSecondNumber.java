package com.java.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HighestSecondNumber {

	public static void main(String[] args) {
		int[] nums = {5,9,11,2,8,21,1};
		
		/*Second highest number*/
		System.out.println(
				Arrays.stream(nums)
					  .boxed()
					  .sorted(Comparator.reverseOrder())
					  .skip(1)
					  .findFirst()
					  .get());
		
		/*Second lowest number*/
		System.out.println(
				Arrays.stream(nums)
					  .boxed()
					  .sorted()
					  .skip(1)
					  .findFirst()
					  .get());

	}

}
