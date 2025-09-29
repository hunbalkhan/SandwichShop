package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        // Asking user for order regular or large, with info given on how much they cost in a string.
        System.out.println("Welcome!");
        System.out.println("Please choose a sandwich size: ");
        System.out.println("1. Regular ($5.45)");
        System.out.println("2. Large ($8.95)");
        int order = scanner.nextInt();

        // base prices of sandwiches
        double regular = 5.45;
        double large = 8.95;

        double basePrice = 0.0; // I used the base price as a variable to hold the chosen price of the user.
        // This declares what the cost will be depending on user input if order is large or regular.
        if (order == 1) {
            basePrice = regular;
        }
        else if (order == 2) {
             basePrice = large;
        }
        else {
            System.out.println("Invalid Order. Order again please.");
            return; // This exits the program early so it doesn't run anything else after.
        }
        scanner.nextLine(); // This clears the buffer/enter key


        // Step 2, First asking for a yes no answer
        System.out.println("Would you like the sandwich to be Loaded? (yes/no): ");
        System.out.println("Regular loaded $1.00");
        System.out.println("Large loaded $1.75");
        String loadedAnswer = scanner.nextLine();

        if (loadedAnswer.equalsIgnoreCase("yes")) { // If the answer is yes to loaded then go through the code.
            if (order == 1) {
                basePrice += 1.00; // If order is 1(R) then add $1.
            }
            else if (order == 2) {
                basePrice += 1.75;  // If order is 2(L) then add $1.75.
            }
        } // Else prompt the next question.




        // Asks the user for age.
        System.out.print("Please enter your age: \n");
        int age = scanner.nextInt();

        //  Applying discounts if they apply.
        double discount = 0.0;
        if (age <= 17) {
            discount = 0.10; // 10% off.
        }
        else if (age >= 65) {
            discount = 0.20; // 20% off.
        }

        // Final price calculation.
        double finalPrice = basePrice - (basePrice * discount);
        System.out.printf("Final price: $%.2f\n", finalPrice);
    }
}