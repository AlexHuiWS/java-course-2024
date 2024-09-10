package org.ethz.day1;
import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        // Read input
        Scanner input = new Scanner(System.in);
        System.out.println("Input a positive integer: ");
        int n = input.nextInt();

        // Check input
        while (n < 0) {
            System.out.println("Invalid! Please enter again: ");
            n = input.nextInt();
        }
        input.close();

        // Calculate Fibonacci number
        int number_2 = 0;
        int number_1 = 1;
        int number_n = -999;

        if (n == 0) {
            number_n = number_2;
        }
        else if (n == 1) {
            number_n = number_1;
        }
        else {
            for (int i = 2; i <= n; i++) {
                number_n = number_2 + number_1;
                number_2 = number_1;
                number_1 = number_n;
            }
        }

        // Print outputs
        System.out.println(n + "th Fibonacci Number is: " + number_n);
    }
    
}
