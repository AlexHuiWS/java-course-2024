package org.ethz.day2;

import java.util.Scanner;

public class ScoreReader {
    public static void main(String[] args) {
        // Declare variables
        int maxCount = 100;
        int count = 0;

        // Read inputs
        Scanner input = new Scanner(System.in);
        System.out.println("Input scores: ");
        double number = input.nextDouble();

        // Store inputs
        double[] scores = new double[maxCount];
        while (number >= 0 && count < maxCount) {
            scores[count] = number;
            count++;
            number = input.nextDouble();
        }
        input.close();

        // Calculate average
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += scores[i];
        }
        double avg = sum / count;

        // Compare individual score with average
        double belowAvgCount = 0;
        for (int i = 0; i < count; i++) {
            if (scores[i] < avg) {
                belowAvgCount += 1;
            }
        }

        // Print outputs
        System.out.println("Total number of scores: " + count);
        System.out.println("Average of score: " + avg);
        System.out.println("== Result ==");
        System.out.println("Number of scores below average: " + belowAvgCount);
        System.out.println("Number of scores above or equal to average: " + (count -belowAvgCount));

    }
}
