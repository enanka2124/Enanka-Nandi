// Created by Enanka Nandi
// Create a small calculator which performs operations such as Addition, Subtraction, Multiplication and Division using class.
//   Calculator inputs :> ‘a’, ‘b’ and ‘type of operation’
//   Datatype :> ‘a’ = double, ‘b’ = double, ‘type of operation’ = string
//   Example :> a = 5, b = 3, operation = "add"
//   Operations :> add, subtract, multiply, divide
//   Output :> Result of the operation

import java.util.Scanner;

public class Problem1 {

    // Calculator class to handle operations
    static class Calculator {
        double num1;
        double num2;
        String operation;

        // Constructor to initialize values
        Calculator(double num1, double num2, String operation) {
            this.num1 = num1;
            this.num2 = num2;
            this.operation = operation.toLowerCase(); // to handle case-insensitive inputs
        }

        // Method to perform calculation
        double getResult() {
            switch (operation) {
                case "add" -> {
                    return num1 + num2;
                }
                case "subtract" -> {
                    return num1 - num2;
                }
                case "multiply" -> {
                    return num1 * num2;
                }
                case "divide" -> {
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero");
                        return 0;
                    } else {
                        return num1 / num2;
                    }
                }
                default -> {
                    System.out.println("Invalid operation entered.");
                    return 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Using try-with-resources to ensure Scanner is closed after use
        try (Scanner sc = new Scanner(System.in)) {
            // Taking input from user
            System.out.print("Enter first number (a): ");
            double a = sc.nextDouble();
            
            System.out.print("Enter second number (b): ");
            double b = sc.nextDouble();
            
            sc.nextLine(); // consume leftover newline
            
            System.out.print("Enter operation (add / subtract / multiply / divide): ");
            String op = sc.nextLine();
            
            // Creating object of Calculator class
            Calculator calc = new Calculator(a, b, op);
            
            // Getting and displaying result
            double result = calc.getResult();
            System.out.println("Result: " + result);
        }
    }
}

