package DSA_Assignments;

import java.util.Scanner;

class large{
	public static void SortingArray(int[] arr) {
	
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
			if(arr[i] > arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
	}
}		System.out.print("Sorted Array : ");
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
}
	
	public static void SecondLargestElement(int[] arr) {
		int Sle = arr.length-2;
		int lastElement = arr.length-1;
		if(arr[Sle] < arr[lastElement]) {
			System.out.println("\nSecond Largest Element is : "+arr[Sle]);
		}
	}
	
	public static void SecondSmallestElement(int[] arr) {
		System.out.println("Second Smallest Element is : "+arr[1]);
	}
}

public class LargestElementsArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.print("Enter the "+size+" elements : ");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		large.SortingArray(arr);
		large.SecondLargestElement(arr);
		large.SecondSmallestElement(arr);
		
	}
}
