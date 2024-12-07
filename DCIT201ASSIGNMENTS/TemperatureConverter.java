package DCIT201ASSIGNMENTS;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        //one scanner objects for all inputs
        Scanner input = new Scanner(System.in);

        int userChoice = 0;
        // Repeating the code  until valid user choice is  (1 or 2)
        while(userChoice != 1 && userChoice != 2){
            System.out.println("Which of the following conversions do you want? \n 1. Convert Celsius to Fahrenheit.\n 2. Convert Fahrenheit to Celsius. \nPlease choose an option (1 or 2): ");
            // Checking if the input is an integer
            if (input.hasNextInt()) {
                userChoice = input.nextInt(); // checking the  user's choice
            } else {
                input.next(); 
                System.out.println("Invalid input.\n Please enter 1 or 2 as your choice.");
            }

            // Processing the  valid choices made by the user
            if (userChoice == 1) {
                System.out.println("Enter the value of the temperature you want to convert from Celsius to Fahrenheit: ");
                if (input.hasNextDouble()) {
                    double celsiusValue = input.nextDouble();
                    // Celsius to Fahrenheit conversion 
                    double fahrenheitValue = (celsiusValue * 9.0 / 5) + 32;
                    System.out.printf("Converting %.2f°C will give you %.2f°F.%n", celsiusValue, fahrenheitValue); // Format output
                } else {
                    input.next(); // checking  invalid input
                    System.out.println("Invalid temperature value. Please enter a numeric value.");
                }
            }
            else if (userChoice == 2) {
                System.out.println("Enter the value of the temperature you want to convert from Fahrenheit to Celsius: ");
                if (input.hasNextDouble()) {
                    double fahrenheitValue = input.nextDouble();
                    // Fahrenheit to Celsius conversion (ensuring floating-point division)
                    double celsiusValue = (fahrenheitValue - 32) * 5.0 / 9;
                    System.out.printf("Converting %.2f°F will give you %.2f°C.%n", fahrenheitValue, celsiusValue); // Format output
                } else {
                    input.next(); // Checking invalid input
                    System.out.println("Invalid temperature value.\n Please enter a numeric value.");
                }
            } else {
                System.out.println("Invalid choice.\n Please enter 1 or 2.");
            }
        }

    }
}
