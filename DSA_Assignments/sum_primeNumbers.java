package DSA_Assignments;

import java.util.Scanner;

class Prime {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) 
            	return false;
        }
        return true;
    }

    public static int sumOfPrimes(int[] arr) {
        int sum = 0;

        for (int n : arr) {
            if (isPrime(n)) {
                sum += n;
            }
        }
        return sum;
    }
}

public class sum_primeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int result = Prime.sumOfPrimes(arr);
        System.out.println("Sum of prime numbers = " + result);

        sc.close();
    }
}