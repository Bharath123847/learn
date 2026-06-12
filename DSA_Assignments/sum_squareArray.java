package DSA_Assignments;
// find the sum of square of array elements 

import java.util.Scanner;

class square{
	public static void sumSquare(int[] arr) {
		int sq = 0;
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sq += arr[i] * arr[i];
			sum += arr[i];
		}
		System.out.print("Square of elements are : "+sq);
		System.out.print("\nthe Sum of the elements : "+sum);
		int div = sum % 5;
		if(div==0) {
			System.out.println("\n"+sum+" is divisible by 5");
		}else {
			System.out.println("\n"+sum + " not divisible by 5");
		}
	}
}


public class sum_squareArray {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the Size of an array : ");

			int size = sc.nextInt();
			
			int[] arr = new int[size];
			System.out.print("Enter the "+size+" Elements : ");
			
			for(int i=0;i<arr.length;i++) {
				arr[i] = sc.nextInt();
			}
			
			square.sumSquare(arr);
		
	}

}
