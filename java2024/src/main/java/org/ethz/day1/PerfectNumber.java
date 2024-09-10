package org.ethz.day1;

public class PerfectNumber {
    public static void main(String[] args) {
        // Loop for 10000 numbers
        int count = 0;
        for (int num = 1; num < 10000; num++){

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
                System.out.println(num + " is a Perfect Number");
            }
        }

    // Print outputs
    System.out.println("Count of all Perfect Numbers less than 10000: " + count);

    }
    
}
