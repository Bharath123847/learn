package DSA_Assignments;

import java.util.Scanner;

//find the sum of negative elements 

class negative{
	public static void SumpositiveElements(int[] arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
		if(arr[i] < 0) {
			sum += arr[i];
		}
	}
		System.out.print("The Sum of negative Elements are : " +sum);
}
}


public class sum_negative_elements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of an array : ");

		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.print("Enter the "+size+" Elements : ");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		negative.SumpositiveElements(arr);
	}
	}