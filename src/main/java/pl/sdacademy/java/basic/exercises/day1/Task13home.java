package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task13home {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int sum = 0;
        int qauntity = 0;
        int positiveNumber = 0;
        do {
            System.out.print("Podaj liczbę i wcisnij enter: ");
            input = scanner.nextInt();
            sum += input;
            if(input != 0) {
                qauntity++;
            }
            if(input > 0) {
                positiveNumber++;
            }
        } while (input != 0);
        System.out.println("Średnia arytmetyczna: " + arithmeticAverage(sum, qauntity));
        System.out.println("Ilość podanych liczb: " + qauntity);
        System.out.println("Ilość podanych liczb dodatnich : " + positiveNumber);

    }

    private static float arithmeticAverage(int a, int b) {
        float arithmetic = a / b;
        return arithmetic;
    }
}
