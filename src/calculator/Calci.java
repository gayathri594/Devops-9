package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Calci {
    // List to store results for delete operation
    static ArrayList<Double> numbers = new ArrayList<>();

    // Addition
    public static double add(double x, double y) {
        return x + y;
    }

    // Subtraction
    public static double subtract(double x, double y) {
        return x - y;
    }

    // Multiplication
    public static double multiply(double x, double y) {
        return x * y;
    }

    // Delete function
    public static String delete(double num) {
        if (numbers.contains(num)) {
            numbers.remove(num);
            return num + " deleted from list.";
        } else {
            return num + " not found in list.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Delete from list");

        System.out.print("Enter choice (1/2/3/4): ");
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= 3) {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            double result = 0;

            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                    break;
            }

            numbers.add(result); // Save the result for potential deletion
            System.out.println("Current list of results: " + numbers);

        } else if (choice == 4) {
            System.out.println("Current list of results: " + numbers);
            System.out.print("Enter the number you want to delete: ");
            double num = scanner.nextDouble();
            System.out.println(delete(num));
            System.out.println("Updated list of results: " + numbers);

        } else {
            System.out.println("Invalid Input");
        }

        scanner.close();
    }
}