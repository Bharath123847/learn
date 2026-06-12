package com.DSA.Basics;

import java.util.Scanner;

// print reverse of number given by user

class rev{
	public static void reverse(int n) {
		int r = 0;
		int rev = 0;
		
		while(n>0) {
			 r = n % 10;
			 rev = r + (rev * 10);
			 n = n/10;
		}
		System.out.println("Reverse = "+rev);
	}
	
}
public class recerse_number {
 public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		sc.close();

		rev.reverse(n);
}
}
