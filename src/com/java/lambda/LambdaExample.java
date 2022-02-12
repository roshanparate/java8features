package com.java.lambda;

public class LambdaExample{

	public static void main(String[] args) {
		
		MyFuntionalInterfacePrintHello myFun2 = ()->System.out.println("Hello...");
		myFun2.helloPrint();
		myFun2.defaultMassage();
		
		MyFuntionalInterfaceWithReturn myFunIn = s->s.length();
		System.out.println(myFunIn.getLength("Java"));
		
		MyFuntionalInterfaceWithParameters myFun1 = (a,b)-> System.out.println("SUM OF VALUE a: "+a+" AND b: "+b+" IS "+ (a+b));
		myFun1.addValues(10, 20);
		
	}

}
