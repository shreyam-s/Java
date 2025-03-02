// Using if-else

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter te First number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second number: ");
        int b = sc.nextInt();
        System.out.print("Choose 1-> Add  2-> Subtract  3-> Multiply  4-> Divide \nEnter your Choice: ");
        int ch = sc.nextInt();

        if(ch == 1){
            System.out.print("Addition of " + a + " and " + b + " = " + (a+b));
        }
        else if(ch == 2){
            System.out.print("subtraction of " + a + " and " + b + " = " + (a-b));
        }
        else if(ch == 3){
            System.out.print("Multiplication of " + a + " and " + b + " = " + (a*b));
        }
        else if(ch == 4){
            System.out.print("Division of " + a + " and " + b + " = " + (a/b));
        }
        else{
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}

/* 

Using Switch Case

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result;

        // Switch case for different operations
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
        }

        scanner.close();
    }
}

*/