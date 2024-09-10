package org.ethz.day2;

import java.util.Scanner;

public class ScoreReader {
    public static void main(String[] args) {
        // Declare variables
        int maxNumber = 5;
        int currentNumber = 0;
        double score;

        // Read inputs
        Scanner input = new Scanner(System.in);
        System.out.println("Input scores: ");
        double[] scores = new double[maxNumber];
        do {
            score = input.nextDouble();
            scores[currentNumber++] = score;
        } while (currentNumber < maxNumber && score >= 0);
        input.close();


    }
}
