package com.DSA.Basics;

import java.util.Scanner;

class Binary {

    public static int Search(int[] arr, int key) {

        // Sorting
        int temp;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {

                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print Sorted Array
        System.out.print("Sorted Array is : ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Binary Search
        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {

            int mid = (low + high) / 2;

            if(key == arr[mid]) {
                return mid;
            }
            else if(key < arr[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return -1;
    }
}

public class BinarySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the " + size + " elements : ");

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the key : ");
        int key = sc.nextInt();

        int result = Binary.Search(arr, key);

        if(result != -1) {
            System.out.println(key + " is present at index " + result);
        }
        else {
            System.out.println(key + " is not present");
        }

        sc.close();
    }
}