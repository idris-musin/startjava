package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private static final int MAX_ATTEMPTS = 10;
    private static final int MAX_ROUND = 3;
    private static final int MAX_NUMBER = 100;
    private final Player[] players;
    private int hiddenNumber;

    public GuessNumber(Player... players) {
        this.players = players;
        drawLots();
    }

    private void drawLots() {
        for (int i = players.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * i);
            Player temp = players[j];
            players[j] = players[i];
            players[i] = temp;
        }
    }

    public void start() {
        for (int i = 1; i <= MAX_ROUND; i++) {
            initRound();
            startRound(i);
        }
        outputGameResult();
        resetScore();
    }

    private void initRound() {
        for (Player player : players) {
            player.clear();
        }
    }

    private void startRound(int round) {
        System.out.println("\nРаунд №" + round);
        System.out.println("У каждого игрока по " + MAX_ATTEMPTS + " попыток\n");
        generateHiddenNumber();
        for (int i = 0; i < MAX_ATTEMPTS; i++) {
            if (isGuessed()) {
                break;
            }
        }
        outputPlayerNumbers();
    }

    private void generateHiddenNumber() {
        hiddenNumber = (int) ((Math.random() * MAX_NUMBER) + 1);
    }

    private boolean isGuessed() {
        for (Player player : players) {
            enterNumber(player);
            if (compareNumbers(player)) {
                return true;
            }
        }
        return false;
    }

    private void enterNumber(Player player) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(player.getName() + ", введите число: ");
            try {
                player.addNumber(scanner.nextInt());
                break;
            } catch (IllegalStateException e) {
                System.out.print("Ошибка: " + e.getMessage());
            }
        }
    }

    private boolean compareNumbers(Player player) {
        if (player.getNumber() == hiddenNumber) {
            player.increaseScore();
            System.out.println("Игрок " + player.getName() + " угадал число " +
                    hiddenNumber + " с " + player.getCountAttempts() + " попытки");
            return true;
        }
        System.out.println("Число, загаданное компьютером " +
                (player.getNumber() > hiddenNumber ? "меньше " : "больше ") + player.getNumber());
        hasAttempts(player);
        return false;
    }

    private void hasAttempts(Player player) {
        if (player.getCountAttempts() == MAX_ATTEMPTS) {
            System.out.println("\nУ " + player.getName() + " закончились попытки\n");
        }
    }

    private void outputPlayerNumbers() {
        for (Player player : players) {
            System.out.print("Числа игрока " + player.getName() + ": ");
            for (int number : player.getNumbers()) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    private void outputGameResult() {
        System.out.println("\nВ ходе игры игроки набрали очки:");
        for (Player player : players) {
            System.out.println("Игрок " + player.getName() + ": " + player.getScore());
        }
        if (isDrawGame()) {
            System.out.println("Ничья!");
        } else {
            Player winner = outputPlayerWinner();
            if (winner != null) {
                System.out.println("Победил " + winner.getName());
            }
        }
    }

    private boolean isDrawGame() {
        int score = players[0].getScore();
        for (Player player : players) {
            if (score != player.getScore()) {
                return false;
            }
        }
        return true;
    }

    private Player outputPlayerWinner() {
        Player winner = players[0];
        for (Player player : players) {
            if (winner.getScore() < player.getScore()) {
                winner = player;
            }
        }
        return winner;
    }

    private void resetScore() {
        for (Player player : players) {
            player.resetScore();
        }
    }
}