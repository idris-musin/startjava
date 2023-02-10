package com.startjava.lesson_2_3.animal;

public class Wolf {
    
    private String gender;
    private String nickname;
    private String color;
    private int age;
    private float weight;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void go() {
        System.out.println("Go");
    }

    public void sit() {
        System.out.println("Sit down");
    }

    public void run() {
        System.out.println("Run");
    }

    public void howl() {
        System.out.println("Howl");
    }

    public void hunt() {
        System.out.println("Hunt");
    }
}