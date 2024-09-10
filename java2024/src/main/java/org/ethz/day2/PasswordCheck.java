package org.ethz.day2;
import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read input
        System.out.println("Input your password: ");
        String password = input.next();

        // Check input
        boolean isValid;
        do {
            isValid = true;

            // Password must have at least 8 characters
            if (password.length() < 8) {
                isValid = false;
            }

            // Password must contain at least one digit
            if (!(password.matches(".*\\d.*"))) {
                isValid = false;
            }

            // Password must not contain a ”.” character
            if (password.contains(".")) {
                isValid = false;
            }
            
            if (isValid == false) {
                System.out.println("Your password is invalid! Please enter again: ");
                password = input.next();
            }
        } while (isValid == false);

        System.out.println("Thank you!");
        input.close();
    }
}