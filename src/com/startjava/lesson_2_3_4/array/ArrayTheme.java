package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {3, 1, 6, 4, 7, 5, 2};
        int len = intArr.length;

        for (int i : intArr) {
            System.out.print(i + " ");
        }

        System.out.println();
        int[] intArrReverse = new int[len];
        for (int i = 0; i < intArrReverse.length; i++) {
            intArrReverse[i] = intArr[len - 1 - i];
            System.out.print(intArrReverse[i] + " ");
        }

        System.out.println("\n\n2. Вывод произведения элементов массива");
        intArr = new int[10];
        len = intArr.length;

        for (int i = 0; i < len; i++) {
            intArr[i] = i;
            System.out.print(intArr[i] + " ");
        }

        System.out.println();
        int mult = 1;

        for (int i = 1; i < len - 1; i++) {
            System.out.print(i);
            mult *= i;
            String result = intArr[i] < intArr[len - 2] ? " * " : " = " + mult;
            System.out.print(result);
        }

        System.out.println("\n" + intArr[0] + " и " + intArr[9]);

        System.out.println("\n3. Удаление элементов массива");
        float[] floatsArr = new float[15];

        for (int i = 0; i < floatsArr.length; i++) {
            floatsArr[i] = (float) Math.random();
        }

        System.out.println("Исходный массив:");
        conclusionFloatsArr(floatsArr);

        float middleNum = floatsArr[floatsArr.length / 2];
        int count = 0;
        for (int i = 0; i < floatsArr.length; i++) {
            if (floatsArr[i] > middleNum) {
                floatsArr[i] = 0;
                count++;
            }
        }

        System.out.println("\nНовый массив:");
        conclusionFloatsArr(floatsArr);
        System.out.println("\nКоличество обнуленных ячеек: " + count);

        System.out.print("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] charArr = new char[26];
        int i = 0;

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            charArr[i++] = ch;
        }

        for (i = charArr.length; i >= 0; i--) {
            for (int j = charArr.length - 1; j >= i; j--) {
                System.out.print(charArr[j]);
            }
            System.out.println();
        }

        System.out.print("\n5. Генерация уникальных чисел");
        intArr = new int[30];
        len = intArr.length;

        for (i = 0; i < len; i++) {
            int randomNum;
            do {
                randomNum = (int) ((Math.random() * (100 - 60)) + 60);
            } while (!isUnique(intArr, randomNum));
            intArr[i] = randomNum;
        }

        Arrays.sort(intArr);
        for (int j = 0; j < len; j++) {
            if (j % 10 == 0) {
                System.out.println();
            }
            System.out.printf("%3d", intArr[j]);
        }

        System.out.println("\n\n6. Копирование не пустых строк");
        String[] array = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int countNotNull = 0;

        for (String str : array) {
            if (!str.isBlank()) {
                countNotNull++;
            }
        }

        String[] newArray = new String[countNotNull];
        int srcPos = 0;
        int destPos = 0;
        int length = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i].isBlank()) {
                System.arraycopy(array, srcPos, newArray, destPos, length);
                srcPos = i + 1;
                destPos += length;
                length = 0;
            } else {
                length++;
            }
        }

        System.out.println("Исходный массив:");
        stringArr(array);
        System.out.println("\nНовый массив:");
        stringArr(newArray);
    }

    private static void conclusionFloatsArr(float[] floatsArr) {
        for (int i = 0; i < floatsArr.length; i++) {
            if (i == 8) {
                System.out.println();
            }
            System.out.print(String.format("%.3f", floatsArr[i]) + " ");
        }
    }

    private static boolean isUnique(int[] intArr, int num) {
        for (int i : intArr) {
            if (num == i) {
                return false;
            }
        }
        return true;
    }

    private static void stringArr(String[] strArr) {
        for (String s : strArr) {
            System.out.printf("[%s] ", s);
        }
    }
}