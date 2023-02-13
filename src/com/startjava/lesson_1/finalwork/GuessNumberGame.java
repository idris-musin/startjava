package com.startjava.lesson_1.finalwork;

public class GuessNumberGame {

    public static void main(String[] args) {
        int numFirst = 0;
        int numLast = 100;
        int numComp = 89;
        int numPlayer = 0;

        while (numPlayer != numComp) {
            numPlayer = numPlayer + (numLast - numFirst) / 2;
            if (numPlayer > numComp) {
                System.out.println("Число " + numPlayer + " больше того, что загадал компьютер");
                numLast = numPlayer;
                numPlayer = numFirst;
            } else if (numPlayer < numComp) {
                System.out.println("Число " + numPlayer + " меньше того, что загадал компьютер");
                numFirst = numPlayer;
            }
        }

        System.out.println("Вы угадали! Загаданное число " + numPlayer);
    }
}