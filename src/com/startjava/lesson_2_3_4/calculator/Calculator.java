package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static int num1;
    private static int num2;
    private static char operation;

    public static double calculate(String str) {
        parseMathExpression(str);
        return switch (operation) {
            case '+' -> (double) Math.addExact(num1, num2);
            case '-' -> (double) Math.subtractExact(num1, num2);
            case '*' -> (double) Math.multiplyExact(num1, num2);
            case '/' -> {
                if (num2 == 0) {
                    throw new ArithmeticException("Делить на ноль запрещено!!!");
                }
                yield (double) num1 / num2;
            }
            case '%' -> {
                if (num2 == 0) {
                    throw new ArithmeticException("Делить на ноль запрещено!!!");
                }
                yield (double) num1 % num2;
            }
            case '^' -> (int) Math.pow(num1, num2);
            default -> throw new IllegalStateException("Неверный математический знак: " + operation);
        };
    }

    private static void parseMathExpression(String string) {
        String[] expression = string.split(" ");
        if (expression.length != 3) {
            throw new NumberFormatException("Неверный формат математической операции!");
        }
        num1 = parseNumber(expression[0]);
        operation = expression[1].charAt(0);
        num2 = parseNumber(expression[2]);
    }

    private static int parseNumber(String string) {
        double number = Double.parseDouble(string);
        if (number < 0) {
            throw new IllegalStateException("Введено отрицательное число!");
        }
        if (number % 1 != 0) {
            throw new IllegalStateException("Введено дробное число!");
        }
        return (int) number;
    }
}