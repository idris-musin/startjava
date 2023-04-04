package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private final int MAX_ATTEMPTS = 10;
    private final int MAX_ROUND = 3;
    private Player[] players;
    private int hiddenNum;

    public GuessNumber(Player[] players) {
        this.players = players;
    }

    public void start() {
        System.out.println("У каждого игрока по " + MAX_ATTEMPTS + " попыток");
        for (int i = 0; i < MAX_ROUND; i++) {
            initRound();
            startRound(i + 1);
        }
    }

    private void initRound() {
        for (Player player :
                players) {
            player.resetNumbers();
        }
    }

    private void startRound(int round) {
        System.out.println("Ранд №" + round);
        generateNumber();
        while (true) {
            if (isEnterNumber()) {
                break;
            }
        }
        outputPlayerNumbers();
    }

    private void generateNumber() {
        hiddenNum = (int) ((Math.random() * 100) + 1);
    }

    private boolean isEnterNumber() {
        Scanner scanner = new Scanner(System.in);
        for (Player activePlayer :
                players) {
            if (activePlayer.getCountAttempts() >= MAX_ATTEMPTS) {
                System.out.println("У " + activePlayer.getName() + " закончились попытки");
                return false;
            }

            while (true) {
                System.out.print(activePlayer.getName() + ", введите число: ");
                try {
                    activePlayer.setNumbers(scanner.nextInt());
                    break;
                } catch (IllegalStateException e) {
                    System.out.print("Ошибка: " + e.getMessage());
                }
            }

            while (isGuessed(activePlayer)) {
                return true;
            }
        }
        return false;
    }

    private boolean isGuessed(Player player) {
        if (player.getNumbers() == hiddenNum) {
            System.out.println("Игрок " + player.getName() + " угадал число " +
                    hiddenNum + " с " + player.getCountAttempts() + " попытки");
            return true;
        }

        if (player.getNumbers() > hiddenNum) {
            System.out.println("Число, загаданное компьютером меньше " + player.getNumbers());
        } else {
            System.out.println("Число, загаданное компьютером больше " + player.getNumbers());
        }
        return false;
    }

    private void outputPlayerNumbers() {
        for (Player player :
                players) {
            System.out.print("Числа игрока " + player.getName() + ": ");
            for (int number :
                    player.getPlayerNumbers()) {
                System.out.printf("%d ", number);
            }
            System.out.println();
        }
    }
}