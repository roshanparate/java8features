package com.java.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

import com.java.vo.Employee;

public class LambdaExample{

	public static void main(String[] args) {
		
		MyFuntionalInterfacePrintHello myFun2 = ()->System.out.println("Hello...");
		myFun2.helloPrint();
		myFun2.defaultMassage();
		
		MyFuntionalInterfaceWithReturn myFunIn = s->s.length();
		System.out.println(myFunIn.getLength("Java"));
		
		MyFuntionalInterfaceWithParameters myFun1 = (a,b)-> System.out.println("SUM OF VALUE a: "+a+" AND b: "+b+" IS "+ (a+b));
		myFun1.addValues(10, 20);
		
		
		// use of exiting functional interface for lambda expression
		Runnable r = ()->{
			for(int i=0; i<5; i++) {
				System.out.println("Print child T" + i);
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("Print main T" + i);
		}
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(0);
		al.add(15);
		al.add(5);
		al.add(20);
		System.out.println("Before sorting " + al);
		// descending order
		Collections.sort(al, (i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
		System.out.println("After sorting " + al);
		
		TreeSet<Integer> hs = new TreeSet<Integer>((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
		hs.add(100);
		hs.add(52);
		hs.add(99);
		hs.add(88);
		hs.add(200);
		// descending order as we added lambda while initialization of TreeSet
		System.out.println(hs);
		
	
		TreeMap<Integer,String> m= new TreeMap<Integer,String>((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
		m.put(1,"Apple");
		m.put(5,"Zebra");
		m.put(40,"Java");
		m.put(12,"Boy");
		m.put(8,"Tiger");
		// descending order as we added lambda while initialization of TreeMap
		System.out.println(m);
		
		ArrayList<Employee> el = new ArrayList<Employee>();
		el.add(new Employee(100, "Jaya","CEO", 30000.50, "Pune"));
		el.add(new Employee(200, "John","CFO", 20000.50,"Mumbai"));
		el.add(new Employee(300, "Ankit","CTO", 10000.50,"Delhi"));
		el.add(new Employee(400, "Virat","Manager", 5000.50,"Pune"));
		el.add(new Employee(500, "Rohit","Clark", 3000.50,"Pune"));

		System.out.println("Before sorting " + el);
		Collections.sort(el, (e1, e2) -> (e1.getEmployeeNo() > e2.getEmployeeNo()) ? -1
				: (e1.getEmployeeNo() < e2.getEmployeeNo()) ? 1 : 0);
		System.out.println("After sorting " + el);
		
		MyFuntionalInterfacePrintHello.staticMethodCall();
		MyFuntionalInterfaceWithParameters.staticMethodCall();
		MyFuntionalInterfaceWithReturn.staticMethodCall();
		
	}

}


