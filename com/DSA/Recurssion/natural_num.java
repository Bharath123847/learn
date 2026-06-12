package com.DSA.Recurssion;

import java.util.Scanner;

class num{
	public static void naturalNumbers(int n) {
		
		if(n >= 1) {
			naturalNumbers(n - 1);
			System.out.print(n+" ");
		}
	}
}

public class natural_num {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		num.naturalNumbers(n);
		sc.close();

	}
}
