package org.ethz.day1;
import java.util.Scanner;

public class ShippingCost {
    public static void main(String[] args) {
        // Define variable
        double cost = 0.;

        // Read input
        Scanner input = new Scanner(System.in);
        System.out.println("Input the weight of the package: ");
        double weight = input.nextDouble();

        // Check input
        while (weight <= 0 || weight > 10) {
            System.out.println("Weight is out of bound! Please enter again: ");
            weight = input.nextDouble();
        }
        input.close();
        
        // Calculate shipping cost
        if (weight <= 0 || weight > 10) {
            System.out.println("Weight is out of bound!");
        }
        else {
            if (weight <= 3) {
                cost = 1.5;
            }
            else if (weight <= 5) {
                cost = 2.5;
            }
            else if (weight <= 10) {
                cost = 4.2;
            }
            System.out.println("Your shipping cost is: " + cost);
        }
    }
}
