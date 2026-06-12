package com.DSA.Basics;
//linear search 
import java.util.Scanner;

class position{
	public static void ArrayPosition(int[] arr, int key) {
		for(int i=0;i<arr.length;i++) {
		if(key == arr[i]) {
			System.out.println(key+" find at index "+i+" ,  position "+(i+1));
			break;
}
		}		
	}
}

public class FindingPositionArrayElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an arry : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.print("Enter the "+size+" elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the key Element to see key position : ");
		int key = sc.nextInt();
		
		position.ArrayPosition(arr, key);


	}

}
