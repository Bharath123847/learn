package com.DSA.Basics;

import java.util.Scanner;

class maxArray{
	public static int Array(int[] arr) {
		
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
		if(max < arr[i]) {
		   max = arr[i];

		}}
		return max;
}
	}

public class maxElementArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of an Array : ");
		int size = sc.nextInt();
		
		//craete an array
		int[] arr = new int[size];
		
		System.out.print("Enter the "+size+" elements :");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
			int result = maxArray.Array(arr);
			System.out.println("The maximum elemenet is "+result);
		}

}
