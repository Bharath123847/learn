package DSA_Assignments;

//find the sum of odd elements in an array


import java.util.Scanner;

class Sum{
	public static void Sum_even_array(int[] arr) {
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 != 0) {
				sum += arr[i];
			}
		}
		System.out.print("The Sum of odd elements : "+sum);
	}
}

public class sum_add_elements {

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
		Sum.Sum_even_array(arr);
	}
		
	}


