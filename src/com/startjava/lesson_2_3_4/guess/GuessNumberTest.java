package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessNumber game = new GuessNumber(createPlayers());
        String answer;

        do {
            game.start();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while(!answer.equals("no"));
    }

    private static Player[] createPlayers() {
        Player[] players = new Player[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Игрок №" + (i + 1) + ", введите имя: ");
            players[i] = new Player(scanner.nextLine());
        }
        return players;
    }
}