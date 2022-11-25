public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java");

        int age = 35;
        boolean isMale = true;
        double growth = 1.70;
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

        if (growth < 1.80) {
            System.out.println("Рост ниже 180 см");
        } else {
            System.out.println("Рост выше 180 см");
        }

        char firstLetetrName = name.charAt(0);
        if (firstLetetrName == 'A') {
            System.out.println("Возможно имя Alexey");
        } else if (firstLetetrName == 'I') {
            System.out.println("Возможно имя Ivan");
        } else {
            System.out.println("Имя начинаеся на какую-то другую букву");
        }

        System.out.println("\n2. Поиск max и min числа");

        int num1 = 126;
        int num2 = 456;

        if (num1 > num2) {
            System.out.println("max = " + num1);
            System.out.println("min = " + num2);
        } else if (num1 < num2) {
            System.out.println("max = " + num2);
            System.out.println("min = " + num1);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n3. Проверка числа");

        if (num1 == 0) {
            System.out.println("Число равно 0");
        } else if (num1 % 2 == 0) {
            if (num1 > 0) {
                System.out.println(num1 + " - четное, положительное число");
            } else {
                System.out.println(num1 + " - четное, отрицательное число");
            }
        } else {
            if (num1 > 0) {
                System.out.println(num1 + " - нечетное, положительное число");
            } else {
                System.out.println(num1 + " - нечетное, отрицательное число");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");

        int hundreds1 = num1 / 100;
        int tens1 = (num1 % 100) / 10;
        int ones1 = num1 % 10;
        int hundreds2 = num2 / 100;
        int tens2 = (num2 % 100) / 10;
        int ones2 = num2 % 10;

        System.out.println("Исходные числа: " + num1 + "; " + num2);

        if (hundreds1 == hundreds2) {
            System.out.println("Одинаковые цифры: " + hundreds1 + "\nОдинаковые цифры в разряде сотен");
        } else {
            System.out.println("Равных цифр нет");
        }

        if (tens1 == tens2) {
            System.out.println("Одинаковые цифры: " + tens1 + "\nОдинаковые цифры в разряде десятков");
        } else {
            System.out.println("Равных цифр нет");
        }

        if (ones1 == ones2) {
            System.out.println("Одинаковые цифры: " + ones1 + "\nОдинаковые цифры в разряде единиц");
        } else {
            System.out.println("Равных цифр нет");
        }

        System.out.println("\n5. Определение символа по его коду");

        char symb = '\u0057';

        if (symb >= '\u0030' & symb <= '\u0039') {
            System.out.println(symb + " - это число");
        } else if (symb >= '\u0041' & symb <= '\u005a') {
            System.out.println(symb + " - это большая буква");
        } else if (symb >= '\u0061' & symb <= '\u007a') {
            System.out.println(symb + " - это маленькая буква");
        } else {
            System.out.println(symb + " - это не буква и не число");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");

        int deposit = 300_000;
        int depositSum;
        int accruedPercent;

        if (deposit < 100_000) {
            accruedPercent = (int) (deposit * 0.05);
        } else if (deposit > 300_000) {
            accruedPercent = (int) (deposit * 0.1);
        } else {
            accruedPercent = (int) (deposit * 0.07);
        }

        depositSum = deposit + accruedPercent;

        System.out.println("Сумма вклада: " + deposit);
        System.out.println("Начисленный процент: " + accruedPercent);
        System.out.println("Итоговая сумма с %: " + depositSum);

        System.out.println("\n7. Определение оценки по предметам");

        int histPercent = 59;
        int progPercent = 91;
        int histEvaluation;
        int progEvaluation;

        int averagePercent = (histPercent + progPercent) / 2;

        if (histPercent <= 60) {
            histEvaluation = 2;
        } else if (histPercent > 60 & histPercent <= 73) {
            histEvaluation = 3;
        } else if (histPercent > 73 & histPercent <= 91) {
            histEvaluation = 4;
        } else {
            histEvaluation = 5;
        }

        System.out.println(histEvaluation + " - история");

        if (progPercent <= 60) {
            progEvaluation = 2;
        } else if (progPercent > 60 & progPercent <= 73) {
            progEvaluation = 3;
        } else if (progPercent > 73 & progPercent <= 91) {
            progEvaluation = 4;
        } else {
            progEvaluation = 5;
        }

        System.out.println(progEvaluation + " - программирование");

        int gpa = (histEvaluation + progEvaluation) / 2;

        System.out.println("средний балл оценок: " + gpa);
        System.out.println("средний процент по предметам: " + averagePercent);

        System.out.println("\n8. Расчет прибыли за год");

        int roomRental = 5_000;
        int saleAverage = 13_000;
        int costPrice = 9_000;

        int saleProfitYear = (saleAverage - costPrice) * 12;
        int roomRentalYear = roomRental * 12;
        int profitYear = saleProfitYear - roomRentalYear;

        if (profitYear < 0) {
            System.out.println("Прибыль за год: " + profitYear + " руб.");
        } else {
            System.out.println("Прибыль за год: " + profitYear + " руб.");
        }

        System.out.println("\n9. Подсчет количества банкнот");

        int moneySum = 567;
        int denomination100 = 10;
        int denomination10 = 5;
        int denomination1 = 50;

        int Amount100 = moneySum / 100;
        int Amount10 = (moneySum % 100) / 10;
        int Amount1 = moneySum % 10;

        if (Amount100 < denomination100) {
            denomination100 = Amount100;
            System.out.println("Количество банкнот номиналом 100: " + denomination100);
        } else {
            Amount10 = Amount10 + (Amount100 - denomination100) * 10;
            System.out.println("Количество банкнот номиналом 100: " + denomination100);
        }

        if (Amount10 < denomination10) {
            denomination10 = Amount10;
            System.out.println("Количество банкнот номиналом 10: " + denomination10);
        } else {
            Amount1 = Amount1 + (Amount10 - denomination10) * 10;
            System.out.println("Количество банкнот номиналом 10: " + denomination10);
        }

        if (Amount1 < denomination1) {
            denomination1 = Amount1;
            System.out.println("Количество банкнот номиналом 1: " + denomination1);
        } else {
            System.out.println("Количество банкнот номиналом 1: " + denomination1);
        }

        int examination = denomination100 * 100 + denomination10 * 10 + denomination1;

        System.out.println("Выданная сумма: " + examination);
    }
}