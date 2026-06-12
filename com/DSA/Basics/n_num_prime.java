package com.DSA.Basics;

import java.util.Scanner;

class isprime{
	public static void prime(int n) {
		int factor = 0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i%j == 0) {
					factor++;
				}
			}
		
		if(factor == 2) {
			System.out.println(i + "--> Prime");
		}else {
			System.out.println(i + "--> Not a Prime");
		}
		factor = 0;

		}	
	}
}

public class n_num_prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		isprime.prime(n);
		sc.close();
	}

}
