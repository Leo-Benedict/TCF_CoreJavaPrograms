package com.tcf.exceptionhandling;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		
		try
		{
			int a = 10 ;
			int b = 0;
			int c;
			c=a/b;
			System.out.println("Division :" +c);
		}
		
		catch(ArithmeticException a)
		{
			System.err.println("Current Exception is :" +a.getMessage());
			
		}
		System.out.println("next line...");
	}

}
