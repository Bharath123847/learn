package com.DSA.Basics;

import java.util.Scanner;

class swap1{
	public static void Swap(int n1, int n2) {
		System.out.println("\nbefore swapping :\n------------ \nFirst number is "+ n1 +"\nSecond number is : "+n2);
////		n1 = n1 + n2 ;
////		n2 = n1 - n2 ;
////		n1 = n1 - n2 ;
//		
		n1 = n1 * n2 ;
		n2 = n1 / n2 ;
		n1 = n1 / n2 ;
		System.out.println("\nAfter swapping :\n-------------- \nFirst number is "+ n1 +"\nSecond number is : "+n2);
//
	}
	
}
public class swap_withou_temp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number : ");
		int n1 = sc.nextInt();
		System.out.print("Enter the Second Number : ");
		int n2 = sc.nextInt();
		sc.close();
		swap1.Swap(n1, n2);
	}
}
