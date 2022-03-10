package pl.sdacademy.java.basic.exercises.day1;

import java.util.Random;
import java.util.Scanner;

public class Tasl11home {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int rndm = random.nextInt(100);
        System.out.println(rndm);
        System.out.println("Podaj liczbę od 0 do 100: ");
        int number = scanner.nextInt();
        result(number, rndm);

    }

    private static void result(int number, int rndm) {
        Scanner scanner = new Scanner(System.in);
        while (number != rndm) {
            if (number > rndm) {
                System.out.println("Za duza");
            } else if (number < rndm) {
                System.out.println("Za mala");
            }
            number = scanner.nextInt();
        }
        System.out.println("Bingo");
    }
}