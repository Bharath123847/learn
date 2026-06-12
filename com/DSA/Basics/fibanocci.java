package com.DSA.Basics;

import java.util.Scanner;

class Fib{
public static void fib(int n) {
	int fib1 = 0;
	int fib2 = 1;
	int fib;
	
	System.out.print("The fibanocci series up to "+n+" is :");
	System.out.print(fib1 + " ");
			
	for(int i=2;i<=n;i++) {
		fib = fib1 + fib2;
		fib1 = fib2;
		fib2 = fib;
		System.out.print(fib1 + " " );

	}

}
}

public class fibanocci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		Fib.fib(n);
		
		
	}

}
