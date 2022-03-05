package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task2 {
    private static final float PI = 3.14F;

    public static void main(String[] args) {
        float radius = getDiameterFromuser() / 2;
        float circumference = caluclateCircumferenceOfACircle(radius);
        float area = calculateAreaOfCircle(radius);
        System.out.println("Circumference Of A Circle: " + circumference);
        System.out.println("Area of Circle: " + area);
    }

    public static float getDiameterFromuser() {
        System.out.println("Please insert diameter: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }

    private static float caluclateCircumferenceOfACircle(float radius) {
       // return 2 * PI * radius;
        return 2 * (float)Math.PI * radius;
    }

    private static float calculateAreaOfCircle(float radius) {
        //return PI * radius * radius;
        return (float)Math.PI * radius * radius;
    }
}