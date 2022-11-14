public class VariablesTheme {

    public static void main(String[] args) {    
        System.out.println("\n1. Вывод значений переменных на консоль");

        byte numCores = 2;
        short ram = 8;
        int windowsVersion = 10;
        long driveSize = 1000;
        float frequency = 2.30f;
        double freeDriveSpace = 446.57d;
        char diskInstalledSystem = 'C';
        boolean availabilityUsb = true;

        System.out.println(numCores + " - количество ядер");
        System.out.println(ram + " - количество оперативной памяти");
        System.out.println(windowsVersion + "версия Windows");
        System.out.println(driveSize + " - размер жесткого диска");
        System.out.println(frequency + " - частота процессора");
        System.out.println(freeDriveSpace + " - количество свободного места на жестком диске");
        System.out.println(diskInstalledSystem + " - название логического диска с установленной Windows");
        System.out.println(availabilityUsb + " - наличие порта USB");

        System.out.println("\n2. Расчет стоимости товара со скидкой");

        int penPrice = 100;
        int bookPrice = 200;
        int discount = 11;
        int discountSum = (penPrice + bookPrice) * discount / 100;
        int dicountPrice = (penPrice + bookPrice) - discountSum;

        System.out.println("Сумма скидки: " + discountSum);
        System.out.println("Общая стоимость товара со скидкой: " + dicountPrice);

        System.out.println("\n3. Вывод слова JAVA");

        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");

        byte numByte = 127;
        short numShort = 32_767;
        int numInt = 2_147_483_647;
        long numLong = 9_223_372_036_854_775_807L;

        System.out.println(numByte + "; " + ++numByte + "; " + --numByte);
        System.out.println(numShort + "; " + ++numShort + "; " + --numShort);
        System.out.println(numInt + "; " + ++numInt + "; " + --numInt);
        System.out.println(numLong + "; " + ++numLong + "; " + --numLong);

        System.out.println("\n5. Перестановка значений переменных");

        int digit1 = 2;
        int digit2 = 5;
        int digit3 = digit1;

        System.out.println("Перестановка с помощью третьей переменной:");
        System.out.println(digit1 + "; " + digit2);
        digit1 = digit2;
        digit2 = digit3;
        System.out.println(digit1 + "; " + digit2);
        System.out.println("Перестановка с помощью арифметических операций:");
        System.out.println(digit2 + "; " + digit1);
        digit2 = digit2 + digit1;
        digit1 = digit2 - digit1;
        digit2 = digit2 - digit1;
        System.out.println(digit2 + "; " + digit1);
        System.out.println("Перестановка с помощью побитовой операции:");
        System.out.println(digit1 + "; " + digit2);
        digit1 = digit1 ^ digit2;
        digit2 = digit1 ^ digit2;
        digit1 = digit1 ^ digit2;
        System.out.println(digit1 + "; " + digit2);

        System.out.println("\n6. Вывод символов и их кодов");

        char symb35 = '#';
        char symb38 = '&';
        char symb64 = '@';
        char symb94 = '^';
        char symb95 = '_';

        System.out.println((int) symb35 + " " + symb35);
        System.out.println((int) symb38 + " " + symb38);
        System.out.println((int) symb64 + " " + symb64);
        System.out.println((int) symb94 + " " + symb94);
        System.out.println((int) symb95 + " " + symb95);

        System.out.println("\n7. Вывод количества сотен, десятков и единиц числа");

        int num = 123;

        int hundreds = num / 100;
        int tens = (num % 100) / 10;
        int ones = (num % 10);

        System.out.println(num);
        System.out.println(hundreds);
        System.out.println(tens);
        System.out.println(ones);

        System.out.println("\n8. Вывод в консоль ASCII-арт Дюка");

        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char parenthesisOpen = '(';
        char parenthesisClose = ')';

        System.out.println("    " + slash + backslash + "     ");
        System.out.println("   " + slash + "  " + backslash + "    ");
        System.out.println("  " + slash + underscore + parenthesisOpen + " " + parenthesisClose + backslash + "   ");
        System.out.println(" " + slash + "      " + backslash + "  ");
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash + backslash + 
            underscore + underscore + backslash + " ");

        System.out.println("\n9. Вывод произведения и суммы цифр числа");

        int sum = hundreds + tens + ones;
        int mult = hundreds * tens * ones;

        System.out.println("сумма цифр числа N = " + sum);
        System.out.println("их произведение = " + mult);

        System.out.println("\n10. Вывод времени");

        int time = 86399;

        int hours = time / 3600;
        int minutes = (time % 3600) / 60;
        int seconds = minutes % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}