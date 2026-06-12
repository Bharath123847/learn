//sorting of array


package DSA_Assignments;
import java.util.*;


class sort{
public static void SortedArray() {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of an array : ");
	int size = sc.nextInt();
	System.out.print("Enter the "+size+" Elements : ");
	
	int[] arr = new int[size];
	for(int i=0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
	}
	
	int temp;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			
		if(arr[i] > arr[j]) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			}
		}
	}
	System.out.print("Sorted array elements are : ");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i] +" ");

	}
	
System.out.println();
	System.out.print("The Sorted array in Descending order : ");
	
	for(int i=arr.length-1;i>=0;i--) {
		System.out.print(arr[i]+" ");
}	
}
}
public class SortArrayDescendingOrder {
	public static void main(String[] args) {
		
		sort.SortedArray();
		
	}
}

