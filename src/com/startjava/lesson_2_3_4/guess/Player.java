package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] numbers = new int[10];
    private int countAttempts;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumbers() {
        return numbers[countAttempts - 1];
    }

    public void setNumbers(int num) {
        if (num <= 0 || num > 100) {
            throw new IllegalStateException("Число не входит в полуинтервал (0; 100]");
        }
        numbers[countAttempts] = num;
        countAttempts++;
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public void setCountAttempts(int countAttempts) {
        this.countAttempts = countAttempts;
    }

    public void resetNumbers() {
        Arrays.fill(numbers, 0, countAttempts, 0);
        countAttempts = 0;
    }

    public int[] getPlayerNumbers() {
        return Arrays.copyOf(numbers, countAttempts);
    }
}