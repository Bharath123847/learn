package DSA_Assignments;

import java.util.Scanner;

// find the maximum element present in an array

class max{
	public static void maxElement(int[] arr) {
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}	
		}
		System.out.print("the maximum element in array is : "+max);
	}
}

public class max_element_array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of an array : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.print("Enter the "+ size + " elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		max.maxElement(arr);
	}

}
