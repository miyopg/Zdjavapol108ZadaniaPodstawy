package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wagę w kg: ");
        float weight = scanner.nextFloat();
        System.out.println("Podaj wzrost w cm: ");
        int height = scanner.nextInt();
        float heightInMeter = (float)height / 100;
        bmi(weight, heightInMeter);

    }
    public static void bmi(float weight, float heightInMeter) {
        float bmi = weight / (heightInMeter * heightInMeter);
          if(bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("BMI is correct: " + bmi );
        }
          else {
            System.out.println("BMI is not correct: " + bmi );
        }

    }
}
