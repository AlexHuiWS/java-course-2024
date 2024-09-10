package org.ethz.day1;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess {
    public static void main(String[] args) {
        // Define variables
        int count = 0;
        int guess = 0;

        // Read input
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer from 0 to 1000: ");
        int number = input.nextInt();

        // Check input
        while (number < 0 || number > 1000) {
            System.out.println("Your input is out of bound! Please enter again: ");
            number = input.nextInt();
        }
        input.close();

        // Guess the integer
        do {
            Random r = new Random(); 
            guess = r.nextInt (1001);
            count += 1;
        } while (guess != number);

        // Print outputs
        System.out.println("Number of guess: " + count);
    }
}
