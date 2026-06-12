package com.DSA.Basics;

import java.util.Scanner;

class sum{
	public static void digit(int n) {
		var r = 0;
		var sum = 0;
		
		while(n > 0) {
			r = n % 10;
			sum = r + sum;
			n = n / 10;
		}
		
		System.out.println(" sum of each digits is : "+sum);
	}
}

public class Sum_individual_digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to sum each digit : ");
		var n = sc.nextInt();
		sum.digit(n);
		sc.close();
		
	}

}
