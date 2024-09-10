package org.ethz.day1;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        // Define variables and constants
        double area;
        double circumference;
        final double PI = 3.1415927;

        // Read input
        Scanner input = new Scanner(System.in);
        System.out.println("Input the radius of the circle: ");
        double radius = input.nextDouble();
        input.close();
        
        // Calculate outputs
        area = PI * radius * radius;
        circumference = 2 * PI * radius;

        // Print outputs
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);



    }
    
}
