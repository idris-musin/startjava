package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";

        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                double result;
                System.out.print("Введите математическое выражение: ");
                String inputExpression = scanner.nextLine();

                try {
                    System.out.print(inputExpression + " = ");
                    result = Calculator.calculate(inputExpression);

                    if (result % 1 == 0) {
                        System.out.println((int) result);
                    } else {
                        System.out.println(result);
                    }
                } catch (ArithmeticException | IllegalStateException | NumberFormatException exception) {
                    System.out.println("Ошибка: " + exception.getMessage());
                }
            }

            System.out.println("Хотите продолжить вычисления? [yes/no]");
            answer = scanner.nextLine();
        }
        scanner.close();
    }
}