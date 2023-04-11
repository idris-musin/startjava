package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private static final int MAX_ATTEMPTS = 10;
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
        int maxRound = 3;
        for (int i = 1; i <= maxRound; i++) {
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
        generateNumber();
        while (hasAttempts()) {
            if (isMove()) {
                break;
            }
        }
        outputPlayerNumbers();
    }

    private void generateNumber() {
        hiddenNumber = (int) ((Math.random() * 100) + 1);
    }

    private boolean hasAttempts() {
        Player activePlayer = players[0];
        if (activePlayer.getCountAttempts() == MAX_ATTEMPTS) {
            System.out.println("\nУ " + activePlayer.getName() + " закончились попытки\n");
            return false;
        }
        return true;
    }

    private boolean isMove() {
        Scanner scanner = new Scanner(System.in);
        for (Player player : players) {
            while (true) {
                System.out.print(player.getName() + ", введите число: ");
                try {
                    player.setNumber(scanner.nextInt());
                    break;
                } catch (IllegalStateException e) {
                    System.out.print("Ошибка: " + e.getMessage());
                }
            }
            if (isGuessed(player)) {
                return true;
            }
        }
        return false;
    }

    private boolean isGuessed(Player player) {
        if (player.getNumber() == hiddenNumber) {
            player.increaseScore();
            System.out.println("Игрок " + player.getName() + " угадал число " +
                    hiddenNumber + " с " + player.getCountAttempts() + " попытки");
            return true;
        }
        System.out.println("Число, загаданное компьютером " +
                (player.getNumber() > hiddenNumber ? "меньше " : "больше ") + player.getNumber());

        return false;
    }

    private void outputPlayerNumbers() {
        for (Player player : players) {
            System.out.print("Числа игрока " + player.getName() + ": ");
            for (int number : player.getNumbers()) {
                System.out.printf("%d ", number);
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

    private Player outputPlayerWinner() {
        Player winner = players[0];
        for (Player player : players) {
            if (winner.getScore() < player.getScore()) {
                winner = player;
            }
        }
        return winner;
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

    private void resetScore() {
        for (Player player : players) {
            player.resetScore();
        }
    }
}