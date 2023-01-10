public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java");

        int age = 35;
        boolean isMale = true;
        double height = 1.70;
        String name = "Ivan";

        if (age > 20) {
            System.out.println("Возраст больше 20 лет");
        } else {
            System.out.println("Возраст меньше 20 лет");
        }

        if (!isMale) {
            System.out.println("Пол женский");
        } else {
            System.out.println("Пол мужской");
        }

        if (height < 1.80) {
            System.out.println("Рост ниже 180 см");
        } else {
            System.out.println("Рост выше 180 см");
        }

        char firstLetterName = name.charAt(0);
        if (firstLetterName == 'A') {
            System.out.println("Возможно имя Alexey");
        } else if (firstLetterName == 'I') {
            System.out.println("Возможно имя Ivan");
        } else {
            System.out.println("Имя начинается на какую-то другую букву");
        }

        System.out.println("\n2. Поиск max и min числа");

        int num1 = 126;
        int num2 = 456;

        if (num1 > num2) {
            System.out.println("max = " + num1 + "\nmin = " + num2);
        } else if (num1 < num2) {
            System.out.println("max = " + num2 + "\nmin = " + num1);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n3. Проверка числа");

        int num3 = 12;

        if (num3 != 0) {
            if (num3 % 2 == 0) {
                System.out.print(num1 + " - четное, ");
            } else {
                System.out.print(num1 + " - нечетное, ");
            }
            if (num3 > 0) {
                System.out.println("положительное число");
            } else {
                System.out.println("отрицательное число");
            }
        } else {
            System.out.println("Число равно 0");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");

        int num4 = 123;
        int num5 = 429;

        int hundreds1 = num4 / 100;
        int tens1 = (num4 % 100) / 10;
        int ones1 = num4 % 10;
        int hundreds2 = num5 / 100;
        int tens2 = (num5 % 100) / 10;
        int ones2 = num5 % 10;

        System.out.println("Исходные числа: " + num4 + "; " + num5);

        if (hundreds1 == hundreds2) {
            System.out.println("Одинаковые цифры: " + hundreds1 + " в разряде сотен");
        } else {
            System.out.println("Равных цифр в разряде сотен нет");
        }

        if (tens1 == tens2) {
            System.out.println("Одинаковые цифры: " + tens1 + " в разряде десятков");
        } else {
            System.out.println("Равных цифр в разряде десятков нет");
        }

        if (ones1 == ones2) {
            System.out.println("Одинаковые цифры: " + ones1 + " в разряде единиц");
        } else {
            System.out.println("Равных цифр в разряде единиц нет");
        }

        System.out.println("\n5. Определение символа по его коду");

        char someChar = '\u0057';

        if (someChar >= '0' && someChar <= '9') {
            System.out.println(someChar + " - это число");
        } else if (someChar >= 'A' && someChar <= 'Z') {
            System.out.println(someChar + " - это большая буква");
        } else if (someChar >= 'a' && someChar <= 'z') {
            System.out.println(someChar + " - это маленькая буква");
        } else {
            System.out.println(someChar + " - это не буква и не число");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");

        int deposit = 300_000;
        double percent = 0.07;

        if (deposit < 100_000) {
            percent = 0.05;
        } else if (deposit > 300_000) {
            percent = 0.1;
        }

        int depositSum = deposit + (int) (deposit * percent);

        System.out.println("Сумма вклада: " + deposit);
        System.out.println("Начисленный процент: " + (int) (deposit * percent));
        System.out.println("Итоговая сумма с %: " + depositSum);

        System.out.println("\n7. Определение оценки по предметам");

        int histPercent = 59;
        int progPercent = 91;
        int histGrade = 5;
        int progGrade = 5;

        if (histPercent <= 60) {
            histGrade = 2;
        } else if (histPercent > 60 & histPercent <= 73) {
            histGrade = 3;
        } else if (histPercent > 73 & histPercent <= 91) {
            histGrade = 4;
        }

        System.out.println(histGrade + " - история");

        if (progPercent <= 60) {
            progGrade = 2;
        } else if (progPercent > 60 & progPercent <= 73) {
            progGrade = 3;
        } else if (progPercent > 73 & progPercent <= 91) {
            progGrade = 4;
        }

        System.out.println(progGrade + " - программирование");

        int gpa = (histGrade + progGrade) / 2;
        int averagePercent = (histPercent + progPercent) / 2;

        System.out.println("средний балл оценок: " + gpa);
        System.out.println("средний процент по предметам: " + averagePercent);

        System.out.println("\n8. Расчет прибыли за год");

        int roomRental = 5_000;
        int saleAverage = 13_000;
        int costPrice = 9_000;

        int profitYear = (saleAverage - costPrice - roomRental) * 12;

        if (profitYear < 0) {
            System.out.println("Прибыль за год: " + profitYear + " руб.");
        } else {
            System.out.println("Прибыль за год: " + profitYear + " руб.");
        }

        System.out.println("\n9. Подсчет количества банкнот");

        int moneySum = 567;
        int amountDenomination100 = 10;
        int amountDenomination10 = 5;
        int amountDenomination1 = 50;

        int amountBanknotes100 = moneySum / 100;
        int amountBanknotes10 = (moneySum % 100) / 10;
        int amountBanknotes1 = moneySum % 10;

        if (amountBanknotes100 < amountDenomination100) {
            amountDenomination100 = amountBanknotes100;
            System.out.println("Количество банкнот номиналом 100: " + amountDenomination100);
        } else {
            amountBanknotes10 += (amountBanknotes100 - amountDenomination100) * 10;
            System.out.println("Количество банкнот номиналом 100: " + amountDenomination100);
        }

        if (amountBanknotes10 < amountDenomination10) {
            amountDenomination10 = amountBanknotes10;
            System.out.println("Количество банкнот номиналом 10: " + amountDenomination10);
        } else {
            amountBanknotes1 += (amountBanknotes10 - amountDenomination10) * 10;
            System.out.println("Количество банкнот номиналом 10: " + amountDenomination10);
        }

        if (amountBanknotes1 < amountDenomination1) {
            amountDenomination1 = amountBanknotes1;
            System.out.println("Количество банкнот номиналом 1: " + amountDenomination1);
        } else {
            System.out.println("Количество банкнот номиналом 1: " + amountDenomination1);
        }

        int examination = amountDenomination100 * 100 + amountDenomination10 * 10 + amountDenomination1;

        System.out.println("Выданная сумма: " + examination);
    }
}