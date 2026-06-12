package com.DSA.Basics;

import java.util.Scanner;

class tri{
	public static void tribonacci(int n) {
		int tri1 = 0;
		int tri2 = 0;
		int tri3 = 1;
		int tri;
		
		System.out.print("Tribonacci Series up to "+n+" is : ");
		System.out.print(tri1+" "+tri2+" "+tri3+" ");
		
		for(int i=4;i<=n;i++) {
			tri = tri1+tri2+tri3;
			tri1 = tri2;
			tri2 = tri3;
			tri3 = tri;
			
			System.out.print(tri+ " ");
		}
	}
}

public class tribonacci_series {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		tri.tribonacci(n);
		
		
	}

}
