package org.ethz.day1;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        // === Part (a) === //
        // Loop for 10000 numbers
        int count = 0;
        for (int num = 1; num < 10000; num++){

            // Search for positive divisors and calculate their sum
            // Looping up to num/2 is already enough
            int sum = 0;
            for (int i = 1; i <= num/2; i++){
                if (num % i == 0) {
                    sum += i;
                }
            }

            // Check if the sum is equal to the original number
            if (num == sum) {
                count += 1;
                System.out.println(num + " is a Perfect Number");
            }
        }

        // Print outputs
        System.out.println("Count of all Perfect Numbers less than 10000: " + count);

        // === Part (b) === //
        // Read input
        Scanner input = new Scanner(System.in);
        System.out.println("Input a positive intege (N) to get N-th Perfect Number: ");
        int n = input.nextInt();

        // Check input
        while (n <= 0) {
            System.out.println("Invalid! Please enter again: ");
            n = input.nextInt();
        }
        input.close();

        // Loop for until n-th perfect number is found
        // Stop when the number exceed 100000
        count = 0;
        int num = 0;
        int limit = 100000;
        while (count < n && num < limit) {
            num += 1;

            // Search for positive divisors and calculate their sum
            // Looping up to num/2 is already enough
            int sum = 0;
            for (int i = 1; i <= num/2; i++){
                if (num % i == 0) {
                    sum += i;
                }
            }

            // Check if the sum is equal to the original number
            if (num == sum) {
                count += 1;
            }
        }

        // Print outputs
        if (count == n) {
            System.out.println(n + " th Perfect Number is: " + num);
        }
        else {
            System.out.println("Sorry, " + n + "th Perfect Number exceeds " + limit);
        }
    }
    
}
