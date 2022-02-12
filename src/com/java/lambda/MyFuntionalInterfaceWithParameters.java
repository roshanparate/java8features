package com.java.lambda;

/*
 * Functional Interface compulsory have only one abstract method.
 * 
 * If we provide two or more abstract methods then it Will give below compilation error
 * "Invalid '@FunctionalInterface' annotation; MyFuntionalInterface is not a functional interface"
 * 
 * Functional Interface can have n number of static and default methods
 * */ 


@FunctionalInterface
public interface MyFuntionalInterfaceWithParameters {
	
	void addValues(int a, int b);
	
	default void defaultMassage() {
		System.out.println("This call from default method");
	}

	public static void staticMethodCall() {
		System.out.println("This call from default method");
	}

}
