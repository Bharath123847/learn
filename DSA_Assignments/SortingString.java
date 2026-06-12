package DSA_Assignments;

import java.util.Scanner;

class SortString{
	public static void string(String s) {
		char temp;
		char[] x = s.toCharArray();
		System.out.print("Sorted String in Char is : ");
		for(char i=0;i<x.length;i++ ) {
			for(char j=(char) (i+1);j<x.length;j++ ) {
				if(x[i] > x[j]) {
				temp = x[i];
				x[i] = x[j];
				x[j] = temp;
				}
			
		}
			System.out.print(x[i]+" ");
//			System.out.print("Sorted String is "+x[i]);


		}
		
		System.out.println();
		System.out.print("Sorted String is : ");
		String y = new String(x);
		System.out.println(y);
	}
}

public class SortingString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any String : ");
		String s = sc.next();
		SortString.string(s);
		
		
	}
}
