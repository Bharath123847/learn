package DSA_Assignments;

import java.util.Scanner;

class ArrayUtil {

    public static void replaceOdd(int[] arr, int replace, int occurrence) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {   
                count++;

                if (count == occurrence) {
                    arr[i] = replace;
                    break;
                }
            }
        }

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}

public class replace_odd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter occurrence (like 1st, 2nd, etc): ");
        int occurrence = sc.nextInt();

        System.out.print("Enter replacement value: ");
        int replace = sc.nextInt();

        ArrayUtil.replaceOdd(arr, replace, occurrence);

        sc.close();
    }
}