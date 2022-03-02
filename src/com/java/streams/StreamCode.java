package com.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCode {
		
	//.filter()
	//.map()
	//.sorted()
	//.min()
	//.max()
	//.forEach()
	//.toArray()
	//Stream.of()
		
	
	public static void main(String arg[]) {

		ArrayList<Integer> num = new ArrayList<>();
		num.add(0);
		num.add(5);
		num.add(10);
		num.add(15);
		num.add(20);
		num.add(25);

		// check even or odd number form list with help of filter and collect as list
		System.out.println(num.stream().filter(I -> I % 2 == 0).collect(Collectors.toList()));

		// double all number form list with help of map and collect as list
		System.out.println(num.stream().map(I -> I * 2).collect(Collectors.toList()));
		System.out.println();

		ArrayList<String> nl = new ArrayList<String>();
		nl.add("Java");
		nl.add("Python");
		nl.add("Go");
		nl.add("Scala");
		nl.add("C++");
		nl.add("C");

		System.out.println(nl.stream().filter(s -> s.length() >= 2).collect(Collectors.toList()));
		System.out.println(nl.stream().map(s -> s.toUpperCase()).collect(Collectors.toList()));
		System.out.println(nl.stream().filter(s -> s.length() >= 2).count());
		System.out.println();
		
		
		//Sorting collection object by .sorted method
		System.out.println(
				num.stream()
				   .sorted((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0)
				   .collect(Collectors.toList()));
		
		System.out.println(
				nl.stream()
				   .sorted()
				   .collect(Collectors.toList()));
		
		System.out.println(
				nl.stream()
				   .sorted((s1, s2) -> - s1.compareTo(s2))
				   .collect(Collectors.toList()));
		
		System.out.println(
				num.stream()
				   .max((s1, s2) -> s1.compareTo(s2))
				   .get());
		
		System.out.println(
				num.stream()
				   .min((s1, s2) -> s1.compareTo(s2))
				   .get());
		
		nl.stream().forEach(s-> System.out.print(s));
		System.out.println();
		nl.stream().forEach(System.out::print);
		System.out.println();
		
		Integer[] array = num.stream().toArray(Integer[]::new);
		for(int i :array) {
			System.out.print(i +" ");
		}
		System.out.println();
		
		Stream<Integer> s = Stream.of(10,100,1000,10000,20000);
		s.forEach(System.out::print);
		System.out.println();
		
		List<List<Integer>> number = new ArrayList<>();
        
        // adding the elements to number arraylist
        number.add(Arrays.asList(1, 2));
        number.add(Arrays.asList(3, 4));
        number.add(Arrays.asList(5, 6));
        number.add(Arrays.asList(7, 8));
        
        System.out.println("List of list-" + number);
        
        // using flatmap() to flatten this list
        List<Integer> flatList
            = number.stream()
                  .flatMap(list -> list.stream())
                  .collect(Collectors.toList());
        
        // printing the list
        System.out.println("List generate by flatMap-"
                           + flatList);
	}
}
