package org.ethz.day2;
import java.util.Arrays;
import java.util.Scanner;

public class CityName {
    public static void main(String[] args) {
        // Read inputs
        Scanner input = new Scanner(System.in);

        System.out.println("Input city number: ");
        int cityNumbers = input.nextInt();
        while (cityNumbers < 0) {
            System.out.println("Your input is out of bound! Please enter again: ");
            cityNumbers = input.nextInt();
        }

        System.out.println("Input city names: ");
        String[] cityNames = new String [cityNumbers];
        for (int i = 0; i < cityNames.length; i++) {
            cityNames[i] = input.next();
        }
        input.close();

        // Arrange their order
        for (int i = 0; i < cityNames.length; i++) {
            for (int j = i; j < cityNames.length; j++) {

                // Swap name
                if (cityNames[i].compareToIgnoreCase(cityNames[j]) > 0) {
                    String tmp = cityNames[i];
                    cityNames[i] = cityNames[j];
                    cityNames[j] = tmp;
                }
            }   
        }

        // Print outputs
        System.out.println("City names in asscending order: " + Arrays.deepToString(cityNames));

    }
}
