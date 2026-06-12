package DSA_Assignments;

import java.util.Scanner;

class Fac {

    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    // find 2nd even number
    public static int findSecondEven(int[] arr) {
        int count = 0;

        for (int n : arr) {
            if (n % 2 == 0) {
                count++;
                if (count == 2) {
                    return n;
                }
            }
        }
        return -1; 
    }
}

public class factorial_evenNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int secondEven = Fac.findSecondEven(arr);

        if (secondEven == -1) {
            System.out.println("2nd even number not found");
        } else {
            int result = Fac.factorial(secondEven);
            System.out.println("2nd Even Number: " + secondEven);
            System.out.println("Factorial: " + result);
        }

        sc.close();
    }
}