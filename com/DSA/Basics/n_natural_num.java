package com.DSA.Basics;

import java.util.Scanner;

class natural{
	public static void n_num(int n) {
		int num = 0;
		
		for(int i=0;i<=n;i++) {
			num += i;
		}
		System.out.println("Sum =" +num );
	}
}



public class n_natural_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		natural.n_num(n);
		sc.close();
		
	}

}
