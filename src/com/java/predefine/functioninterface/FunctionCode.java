package com.java.predefine.functioninterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Predicate;

import com.java.vo.Employee;
import com.java.vo.Student;

public class FunctionCode {

	public static void main(String[] args) {
		
		Function<String, Integer> getLen = s-> s.length();
		System.out.println(getLen.apply("Software Engineer"));
		System.out.println();
		
		Function<Integer, Integer> getSeq = i -> i*i;
		System.out.println(getSeq.apply(5));
		System.out.println();
		
		String line ="I am software engineer";
		Function<String, String> removeSpace = s-> s.replaceAll(" ", "");
		System.out.println(removeSpace.apply(line));
		System.out.println();
		
		Function<String, Integer> spaceCon = s-> s.replaceAll(" ", "").length();
		System.out.println(spaceCon.apply(line));
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
		
		for(Student s : sList) {
			if(marPredicate.test(s)) {
				System.out.print("Name: " + s.name );
				System.out.print(" Marks: " + s.marks);
				System.out.println(" Grad: " + gradF.apply(s));
			}
		}
		System.out.println();
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(100, "Jaya","CEO", 30000.50, "Pune"));
		emp.add(new Employee(200, "John","CFO", 20000.50,"Mumbai"));
		emp.add(new Employee(300, "Ankit","CTO", 10000.50,"Delhi"));
		emp.add(new Employee(400, "Virat","Manager", 5000.50,"Pune"));
		emp.add(new Employee(500, "Rohit","Clerk", 3000.50,"Pune"));
		emp.add(new Employee(600, "Jay","Manager", 5000.50,"Nagpur"));
		emp.add(new Employee(700, "Om","Manager", 5000.50,"Pune"));
		
		Function<ArrayList<Employee>, Double> getTotalSalF = empl-> {
			double total =0;
			for (Employee em: empl) {
				total += em.salary;
			}
			return total;
		};
		
		System.out.println(getTotalSalF.apply(emp));
		System.out.println();
		
		// default method in Function interface 
		// f1.andThen(f2) f1 will applied followed by f2
		// f1.compare(f2) f2 will be applied followed by f1
		
		Function<String, String> upperCaseF = s-> s.toUpperCase();
		Function<String, String> sunStringF = s-> s.substring(0,9);
		
		System.out.println(upperCaseF.apply("SoftwareEngineer"));
		System.out.println(sunStringF.apply("SoftwareEngineer"));
		
		System.out.println(upperCaseF.andThen(sunStringF).apply("SoftwareEngineer"));
		System.out.println(upperCaseF.compose(sunStringF).apply("SoftwareEngineer"));
		System.out.println();
		
		
		//F identify() is static method in Function Interface
		
		
	}

}
