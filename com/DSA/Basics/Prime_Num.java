package com.DSA.Basics;

import java.util.Scanner;

class prime{
	public static void P(int n){
		int factor = 0;
		
	for(int i=1;i<=n;i++) {
		if(n%i == 0) {
			factor++;
		}
	}
		if(factor==2) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a Prime Number");
		}
	}
}




public class Prime_Num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		prime.P(n);
		sc.close();
		
	}

}
