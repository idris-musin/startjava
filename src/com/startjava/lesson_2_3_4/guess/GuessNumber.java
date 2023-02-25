package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int hiddenNum;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        generateNumber();
        do {
            enterNumber(player1);
            if (isGuessed(player1)) {
                break;
            }
            enterNumber(player2);
            if (isGuessed(player2)) {
                break;
            }
        } while (true);
    }

    private void generateNumber() {
        hiddenNum = (int) ((Math.random() * 100) + 1);
    }

    private void enterNumber(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(player.getName() + ", введите число: ");
        player.setNumber(scanner.nextInt());
        scanner.nextLine();
    }

    private boolean isGuessed(Player player) {
        if (player.getNumber() == hiddenNum) {
            System.out.println("Победил игрок " + player.getName() + ". Компьютер загадал число " + hiddenNum);
            return true;
        }
        if (player.getNumber() > hiddenNum) {
            System.out.println("Число, загаданное компьютером меньше " + player.getNumber());
        } else {
            System.out.println("Число, загаданное компьютером больше " + player.getNumber());
        }
        return false;
    }
}