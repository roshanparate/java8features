package com.java.predefine.functioninterface;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierCode {

	public static void main(String[] args) {
		
		Supplier<Date> getS = ()-> new Date();
		System.out.println(getS.get());
		System.out.println();
		
		Supplier<String> getNames =()->{
			String[] sname = {"Prakash","Vaihav","Priti","Nilam","Dheeraj"};
			return sname[(int)(Math.random()*4)];
		};
		
		System.out.println(getNames.get());
		System.out.println(getNames.get());
		System.out.println(getNames.get());
		System.out.println();
		
		Supplier<String> getOTP =()->{
			String otp= "";
			for(int i=0;i<6;i++) {
			otp += (int)(Math.random()*10);
			}
			return otp;
		};
		
		System.out.println(getOTP.get());
		System.out.println(getOTP.get());
		System.out.println(getOTP.get());
		System.out.println();
	}

}
