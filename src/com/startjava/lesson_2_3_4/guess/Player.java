package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] numbers = new int[10];
    private int countAttempts;
    private int score;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return numbers[countAttempts - 1];
    }

    public void setNumbers(int num) {
        if (num <= 0 || num > 100) {
            throw new IllegalStateException("Число не входит в полуинтервал (0; 100]\n");
        }
        numbers[countAttempts] = num;
        countAttempts++;
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public int getScore() {
        return score;
    }

    public void resetNumbers() {
        Arrays.fill(numbers, 0, countAttempts, 0);
        countAttempts = 0;
    }

    public int[] getPlayerNumbers() {
        return Arrays.copyOf(numbers, countAttempts);
    }

    public void countScore() {
        score++;
    }

    public void resetScore() {
        score = 0;
    }
}