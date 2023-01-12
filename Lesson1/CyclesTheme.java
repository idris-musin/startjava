public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");

        int numFirst = -10;
        int numLast = 21;
        int numEven = 0;
        int numOdd = 0;

        do {
            if (numFirst % 2 == 0) {
                numEven += numFirst;
            } else {
                numOdd +=  numFirst;
            }
            numFirst++;
        } while (numFirst <= numLast);

        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + numEven + ", а нечетных = " + numOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max;
        int min;

        if (num1 > num2 & num1 > num3) {
            max = num1;
        } else if (num2 > num1 & num2 > num3) {
            max = num2;
        } else max = num3;

        if (num1 < num2 & num1 < num3) {
            min = num1;
        } else if (num2 < num1 & num2 < num3) {
            min = num2;
        } else min = num3;

        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");

        int num4 = 1234;
        int sum = 0;

        int numBack = 0;
        while (num4 != 0) {
            numBack += num4 % 10;
            sum += numBack % 10;
            num4 /= 10;

            if (num4 != 0) {
                numBack *= 10;
            }
        }

        System.out.println("Исходное число в обратном порядке: " + numBack);
        System.out.println("Сумма цифр числа: " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");

        int numMin = 1;
        int numMax = 24;
        int count = 0;

        for (int i = numMin; i < numMax; i += 2) {
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
        int count1 = 0;

        System.out.print("Число " + num1 + " содержит ");

        while (num != 0) {
            if (num % 10 == 2) {
                count1++;
            }
            num /= 10;
        }

        if (count1 % 2 ==0) {
            System.out.println(count1 + " (четное) количество двоек");
        } else {
            System.out.println(count1 + " (нечетное) количество двоек");
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

        int numReverse = 0;
        while (numCopy != 0) {
            numReverse += numCopy % 10;
            numCopy /= 10;

            if (numCopy != 0) {
                numReverse *= 10;
            }
        }

        if (palindrome == numReverse) {
            System.out.println("Число " + palindrome + " является палиндромом");
        } else {
            System.out.println("Число " + palindrome + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");

        int number = 159366;

        int sumNumberFirst = 0;
        int sumNumberLast = 0;

        int numberCopy = number;
        int digitAmount = 0;

        while (numberCopy != 0) {
            numberCopy /= 10;
            digitAmount++;
        }

        if (digitAmount == 6) {
            int numberFirst = number / 1000;

            System.out.print("Сумма цифр " + numberFirst + " = ");

            while (numberFirst != 0) {
                int digitFirst = numberFirst % 10;
                numberFirst /= 10;
                sumNumberFirst += digitFirst;
            }

            System.out.println(sumNumberFirst);

            int numberLast = number % 1000;

            System.out.print("Сумма цифр " + numberLast + " = ");

            while (numberLast != 0) {
                int digitLast = numberLast % 10;
                numberLast /= 10;
                sumNumberLast += digitLast;
            }

            System.out.println(sumNumberLast);

            if (sumNumberFirst == sumNumberLast) {
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

        for (int i = 2; i <= 9 ; i++) {
            System.out.printf("%1d |", i);
            for (int j = i * 2; j <= i * 9; j = j+i) {
                System.out.printf("%3d", j);
            }
            System.out.println();
        }
    }
}