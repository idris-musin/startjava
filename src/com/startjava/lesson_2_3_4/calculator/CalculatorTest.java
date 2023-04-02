package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";

        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                String inputExpression = scanner.nextLine();

                try {
                    double result = Calculator.calculate(inputExpression);
                    printResult(result, inputExpression);
                } catch (ArithmeticException | IllegalStateException | NumberFormatException e) {
                    System.out.println("\nОшибка: " + e.getMessage());
                }
            }

            System.out.println("\nХотите продолжить вычисления? [yes/no]");
            answer = scanner.nextLine();
        }
        scanner.close();
    }

    private static void printResult(double number, String inputExpression) {
        System.out.printf(inputExpression + " = " + (number % 1 == 0 ? (int) number : "%f"), number);
    }
}