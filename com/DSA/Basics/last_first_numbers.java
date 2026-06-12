package com.DSA.Basics;

import java.util.Scanner;

// print last digit and except last digit ;
class Demo{
public static void lastdigit(int n) {
	int LD = n % 10;
	int FD = n / 10;
	System.out.println("Last Digit is : " +LD);
	System.out.println("Except Last Digit is : " +FD);

}
}

public class last_first_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		Demo.lastdigit(n);
		sc.close();
	}
}
