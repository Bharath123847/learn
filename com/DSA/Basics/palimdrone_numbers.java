package com.DSA.Basics;

import java.util.Scanner;

class pal{
	public static void Pal(int n) {
		int n1 = n;
		int r = 0;
		int rev = 0;
		
		while(n>0) {
			 r = n % 10;
			 rev = r + (rev * 10);
			 n = n/10;
		}
		if(n1 == rev) {
			System.out.println("given number is palindrone :" +rev);
		}else {
			System.out.println("given number is not a palindrone :" +rev);

		}
	}
}


public class palimdrone_numbers {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		sc.close();

		pal.Pal(n);
	}
}
