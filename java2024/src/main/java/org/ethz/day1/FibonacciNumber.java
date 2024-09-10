package org.ethz.day1;
import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        // Read input
        Scanner input = new Scanner(System.in);
        System.out.println("Input a non-negative integer: ");
        int n = input.nextInt();

        // Check input
        while (n < 0) {
            System.out.println("Invalid! Please enter again: ");
            n = input.nextInt();
        }
        input.close();

        // Calculate Fibonacci number
        int fibonacci_0 = 0;
        int fibonacci_1 = 1;
        int fibonacci_n = fibonacci_0;

        if (n == 0) {
            fibonacci_n = fibonacci_0;
        }
        else if (n == 1) {
            fibonacci_n = fibonacci_1;
        }
        else {
            for (int i = 2; i <= n; i++) {
                fibonacci_n = fibonacci_0 + fibonacci_1;
                fibonacci_0 = fibonacci_1;
                fibonacci_1 = fibonacci_n;
            }
        }

        // Print outputs
        System.out.println(n + "th Fibonacci Number is: " + fibonacci_n);
    }
    
}
