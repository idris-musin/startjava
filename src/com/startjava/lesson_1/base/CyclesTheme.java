package com.startjava.lesson_1.base;

public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");

        int startSegment = -10;
        int endSegment = 21;
        int sumEven = 0;
        int sumOdd = 0;

        do {
            if (startSegment % 2 == 0) {
                sumEven += startSegment;
            } else {
                sumOdd += startSegment;
            }
            startSegment++;
        } while (startSegment <= endSegment);

        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num2;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num1 < min) {
            min = num1;
        }
        if (num3 < min) {
            min = num3;
        }

        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");

        int num4 = 1234;
        int sum = 0;

        System.out.print("Исходное число в обратном порядке: ");

        while (num4 > 0) {
            int digit = 0;
            digit = num4 % 10;
            sum += digit;
            num4 /= 10;

            System.out.print(digit);
        }

        System.out.println("\nСумма цифр числа: " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");

        int min1 = 1;
        int max2 = 24;
        int count = 0;

        for (int i = min1; i < max2; i += 2) {
            count++;
            System.out.printf("%3d", i);

            if (count % 5 == 0) {
                System.out.println();
            }
        }

        while (count % 5 != 0) {
            System.out.printf("%3d", 0);
            count++;
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");

        int num = 3242592;
        int countTwos = 0;

        System.out.print("Число " + num + " содержит ");

        while (num != 0) {
            if (num % 10 == 2) {
                countTwos++;
            }
            num /= 10;
        }

        if (countTwos % 2 == 0) {
            System.out.println(countTwos + " (четное) количество двоек");
        } else {
            System.out.println(countTwos + " (нечетное) количество двоек");
        }

        System.out.println("\n6. Отображение фигур в консоли");

        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();

        int rowAmount = 5;
        while (rowAmount > 0) {
            int columnAmount = rowAmount;
            while (columnAmount > 0) {
                System.out.print("#");
                columnAmount--;
            }

            System.out.println();
            rowAmount--;
        }

        System.out.println();

        rowAmount = 1;
        int columnAmount = 1;

        do {
            int count2 = 1;

            do {
                System.out.print('$');
                count2++;
            } while (count2 <= columnAmount);

            rowAmount++;

            if (rowAmount <= 3) {
                columnAmount++;
            } else {
                columnAmount--;
            }

            System.out.println();
        } while (rowAmount <= 5);

        System.out.println("\n7. Отображение ASCII-символов");

        System.out.println("Dec Char");

        for (int i = 0; i < 48; i++) {
            if (i % 2 != 0) {
                System.out.printf("%3d%5c%n", i, (char) i);
            }
        }

        for (int i = 97; i < 123; i++) {
            if (i % 2 != 0) {
                System.out.printf("%3d%5c%n", i, (char) i);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");

        int palindrome = 1234321;
        int numCopy = palindrome;

        int reverseNum = 0;
        while (numCopy > 0) {
            reverseNum = reverseNum * 10 + numCopy % 10;
            numCopy /= 10;
        }

        if (palindrome == reverseNum) {
            System.out.println("Число " + palindrome + " является палиндромом");
        } else {
            System.out.println("Число " + palindrome + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");

        int number = 159366;

        int sumLeftHalf = 0;
        int sumRightHalf = 0;

        int numberCopy = number;
        int digitAmount = 0;
        int digitNumber = 1;

        while (numberCopy != 0) {
            numberCopy /= 10;
            digitAmount++;
        }

        if (digitAmount == 6) {
            int leftHalf = number / 1000;
            int rightHalf = number % 1000;
            int copyNum = number;

            while (copyNum != 0) {
                if (digitNumber > 3) {
                    sumLeftHalf += copyNum % 10;
                } else {
                    sumRightHalf += copyNum % 10;
                }
                copyNum /= 10;
                digitNumber++;
            }

            System.out.println("Сумма цифр " + leftHalf + " = " + sumLeftHalf);
            System.out.println("Сумма цифр " + rightHalf + " = " + sumRightHalf);

            if (sumLeftHalf == sumRightHalf) {
                System.out.println("Число " + number + " является счастливым");
            } else {
                System.out.println("Число " + number + " не является счастливым");
            }
        } else {
            System.out.println("Число не является шестизначным");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");

        System.out.print("  |");
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%3d", i);
        }

        System.out.println("\n--|------------------------");

        for (int i = 2; i <= 9; i++) {
            System.out.printf("%1d |", i);
            for (int j = i * 2; j <= i * 9; j = j + i) {
                System.out.printf("%3d", j);
            }
            System.out.println();
        }
    }
}