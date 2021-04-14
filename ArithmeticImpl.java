package com.vedantacomp.core;

import java.util.Scanner;

public class ArithmeticImpl extends Arithmetic {

	@Override
	public int add(int x, int y) {		
		return x+y;
	}

	@Override
	public float div(int x, int y) {
		return (float)x/y;
	}

	@Override
	public int mult(int x, int y) {
		return x*y;
	}

	@Override
	public int sub(int x, int y) {
		return x-y;
	}

	public static void main(String[] args) {
		ArithmeticImpl arithmetic=new ArithmeticImpl();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st Number :");
		int a=sc.nextInt();
		System.out.println("Enter 2nd Number :");
		int b=sc.nextInt();
		
		System.out.println("Addition is : "+arithmetic.add(a, b));
		System.out.println("Multiplication is : "+arithmetic.mult(a, b));
		System.out.println("Division is : "+arithmetic.div(a, b));
		System.out.println("Substraction is : "+arithmetic.sub(a, b));		
	}

}
