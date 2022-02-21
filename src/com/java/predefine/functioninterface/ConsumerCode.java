package com.java.predefine.functioninterface;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.java.vo.Movie;
import com.java.vo.Student;

public class ConsumerCode {

	public static void main(String[] args) {
		
		Consumer<String> con = s->System.out.println(s);
		con.accept("Hello..");
		System.out.println();
		
		
		ArrayList<Movie> mList = new ArrayList<>();
		mList.add(new Movie("Dil","Amir Khan","Madhuri"));
		mList.add(new Movie("Krish","Hritik Roshan","Priti"));
		mList.add(new Movie("Wanted","Salman Khan","Ayesha"));
		mList.add(new Movie("Raid","Ajay Devgn","Ileana"));
		
		Consumer<Movie> conMovie = m->{
			System.out.print("Movie Name: "+m.name);
			System.out.print(", Hero Name: "+m.hero);
			System.out.println(", Heroine Name: "+m.heroine);
		};
		
		for(Movie m: mList) conMovie.accept(m);
		System.out.println();
		
		ArrayList<Student> sList = new ArrayList<Student>();
		sList.add(new Student("Rohan", 90));
		sList.add(new Student("Pradip", 60));
		sList.add(new Student("Ankit", 80));
		sList.add(new Student("Kishor", 75));
		sList.add(new Student("Prem", 55));
		sList.add(new Student("Prince",42));
		sList.add(new Student("Mohan", 30));
		
		Predicate<Student> marPredicate = stu -> stu.marks>=60;
		
		Function<Student, String> gradF = s -> {
			int marks = s.marks;
			if (marks >= 80) {
				return "A[Distintion]";
			} else if (marks >= 60) {
				return "B[First class]";
			} else if (marks >= 50) {
				return "C[Second class]";
			} else if (marks >= 35) {
				return "D[Third class]";
			} else {
				return "E[Failed class]";
			}
		};
		
		Consumer<Student> printS = s->{
			System.out.print("Name: " + s.name );
			System.out.print(", Marks: " + s.marks);
			System.out.println(", Grad: " + gradF.apply(s));
		};
		
		for(Student s : sList) {
			if(marPredicate.test(s)) {
				printS.accept(s);
			}
		}
		System.out.println();
		
		
		// andThen() default method present in Consumer interface
	}
}
