package com.java.predefine.functioninterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.function.Predicate;

import com.java.vo.Employee;
import com.java.vo.User;

public class PredicateCode {

	public static void main(String[] args) {
		
		Predicate<Integer> p = I -> I>3;
		System.out.println(p.test(10));
		System.out.println(p.test(2));
		System.out.println();
		
		Predicate<Integer> p1 = I -> I%2==0;
		System.out.println(p1.test(10));
		System.out.println();
		
		Predicate<Collection> c = I-> I.isEmpty();
		ArrayList a = new ArrayList();
		a.add(10);
		System.out.println(c.test(a));
		ArrayList b = new ArrayList();
		System.out.println(c.test(b));	
		
		String[] name = {"Durga","", null,"Ankit","","Ganesh",null};
		Predicate<String> myP = s-> null != s && s.length() !=0;
		for(String s:name) {
			if(myP.test(s)) System.out.println(s);
		}
		System.out.println();
		
		
		Predicate<User> pU =  user-> user.username.equals("Kunal") && user.pwd.equals("ABC123"); 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Name: ");
		String userN = sc.next();
		System.out.println("Enter Pwd: ");
		String pwd = sc.next();
		User u = new User(userN,pwd);
		System.out.println(pU.test(u)?true:false);
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(100, "Jaya","CEO", 30000.50, "Pune"));
		emp.add(new Employee(200, "John","CFO", 20000.50,"Mumbai"));
		emp.add(new Employee(300, "Ankit","CTO", 10000.50,"Delhi"));
		emp.add(new Employee(400, "Virat","Manager", 5000.50,"Pune"));
		emp.add(new Employee(500, "Rohit","Clerk", 3000.50,"Pune"));
		emp.add(new Employee(600, "Jay","Manager", 5000.50,"Nagpur"));
		emp.add(new Employee(700, "Om","Manager", 5000.50,"Pune"));
		//System.out.println(emp);
		
		Predicate<Employee> desi = em -> em.designation.equals("Manager");
		display(desi, emp);
		
		Predicate<Employee> city = em1 -> em1.city.equals("Pune");
		display(city, emp);
		
		Predicate<Employee> sal = em2 -> em2.salary <10000.50;
		display(sal, emp);
		
		// default methods which use for two predicate as single predicate 
		//negate
		//and
		//or
		
		display(desi.and(city), emp);
		
		display(desi.or(sal), emp);
		
		display(desi.negate(), emp);
		System.out.println();
		
		// isEqual static method present in Predicate interface
		
		Predicate<String> pred1 = Predicate.isEqual("Java");
		System.out.println(pred1.test("Java"));
		System.out.println();
		
		Predicate<Employee> isCEO = Predicate.isEqual(new Employee(100, "Jaya","CEO", 30000.50, "Pune"));
		System.out.println(isCEO.test(new Employee(700, "Om","Manager", 5000.50,"Pune")));
	}

	public static void display(Predicate<Employee> p , ArrayList<Employee> list) {
		for(Employee e : list) {
			if(p.test(e)) {
				System.out.println(e);
			}
		}
		System.out.println("///////////////////////////////////////////////////////");
	}
}
