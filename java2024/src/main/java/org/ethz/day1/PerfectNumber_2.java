package org.ethz.day1;
import java.util.Scanner;

public class PerfectNumber_2 {
    public static void main(String[] args) {
        // Read input
        Scanner input = new Scanner(System.in);
        System.out.println("Input a positive integer: ");
        int n = input.nextInt();

        // Check input
        while (n <= 0) {
            System.out.println("Invalid! Please enter again: ");
            n = input.nextInt();
        }
        input.close();

        // Loop for until n-th perfect number is found
        int count = 0;
        int num = 0;
        while (count < n) {
            num += 1;

            // Search for positive divisors and calculate their sum
            int sum = 0;
            for (int i = 1; i < num; i++){
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
        System.out.println(n + " th Perfect Numbers is: " + num);
    }
}
