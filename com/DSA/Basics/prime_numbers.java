package com.DSA.Basics;

import java.util.*;

class P {
    public static void generatePrimeNumbers(int n) {
        for (int i = 2; i <= n; i++) {
            int factors = 0;

            for (int j = 1; j <= i; j++) {   // start from 1
                if (i % j == 0) {
                    factors++;
                }
            }

            if (factors == 2) {
                System.out.print(i + " ");
            }
        }
    }
}

public class prime_numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        P.generatePrimeNumbers(n);
        sc.close();
    }
}
