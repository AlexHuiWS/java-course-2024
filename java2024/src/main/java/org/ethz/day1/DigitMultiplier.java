package org.ethz.day1;

import java.util.Scanner;
import java.lang.Math;

public class DigitMultiplier {
    public static void main(String[] args) {
        // Define variable (product of all digits)
        int product = 1;

        // Read input
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer: ");
        int number = input.nextInt();
        input.close();
        
        // Multiply all digits
        number = Math.abs(number);
        do {
            product *= number % 10;
            number = number / 10;
        } while (number > 0);

        // Print outputs
        System.out.println("Product of all digits: " + product);
    }
}
