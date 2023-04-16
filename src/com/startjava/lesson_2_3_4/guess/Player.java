package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private static final int MAX_ATTEMPTS = 10;
    private static final int MAX_NUMBER = 100;
    private final String name;
    private final int[] numbers = new int[MAX_ATTEMPTS];
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

    public void addNumber(int num) {
        if (num <= 0 || num > MAX_NUMBER) {
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

    public void clear() {
        Arrays.fill(numbers, 0, countAttempts, 0);
        countAttempts = 0;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, countAttempts);
    }

    public void increaseScore() {
        score++;
    }

    public void resetScore() {
        score = 0;
    }
}