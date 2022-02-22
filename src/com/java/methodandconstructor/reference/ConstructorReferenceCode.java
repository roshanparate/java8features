package com.java.methodandconstructor.reference;

public class ConstructorReferenceCode {

	public static void main(String[] args) {
		GetTestClassInterface tc = TestClass::new;
		
		TestClass testClass = tc.getTestClass();
		
	}

}
