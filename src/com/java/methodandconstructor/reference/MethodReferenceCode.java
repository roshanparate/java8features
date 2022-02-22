package com.java.methodandconstructor.reference;

public class MethodReferenceCode {

	public static void helloPrint2() {
		System.out.println("Hello.. Print 2");
	}
	
	public static void main(String[] args) {
		PrintHelloInterface print = MethodReferenceCode::helloPrint2;
		
		print.helloPrint();
	}

}
