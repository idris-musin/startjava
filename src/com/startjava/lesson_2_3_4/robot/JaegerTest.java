package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Cherno Alpha");
        jaeger1.setMark("Mark-1");
        jaeger1.setOrigin("Russia");
        jaeger1.setHeight(85.34f);
        jaeger1.setWeight(2.412f);
        jaeger1.setSpeed(3);
        jaeger1.setStrength(10);
        jaeger1.setArmor(10);

        Jaeger jaeger2 = new Jaeger("Coyote Tango", "Mark-1", "Japan",
                85.34f, 2.312f, 5, 7, 4);

        System.out.println(jaeger1.getModelName() + " entered the drift: " + jaeger1.drift());
        System.out.println(jaeger1.getModelName() + " " + jaeger1.scanKaiju());
        System.out.print(jaeger1.getModelName() + " ");
        jaeger1.move();
        System.out.println(jaeger1.getSpeed() + " towards the Kaiju");
        System.out.println("His strength " + jaeger1.getStrength());

        System.out.println(jaeger2.getModelName() + " entered the drift: " + jaeger1.drift());
        System.out.print(jaeger2.getModelName() + " ");
        jaeger2.move();
        jaeger2.setSpeed(3);
        System.out.println(jaeger2.getSpeed() + " towards the Kaiju");
        System.out.println("His strength " + jaeger2.getStrength());

        int strengthTwoJaeger = jaeger1.getStrength() + jaeger2.getStrength();

        System.out.println("Their strength " + strengthTwoJaeger);
        
        System.out.print(jaeger1.getModelName());
        jaeger1.useVortexCannon();
        System.out.print(jaeger2.getModelName());
        jaeger2.useVortexCannon();

        System.out.println("They won Kaiju!!!");
    }
}