package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task10home {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");
        int number = scanner.nextInt();
        System.out.println("Suma cyfr podanej liczby to: " + count(number));

    }
    private static int count (int number) {
        int result = 0;
        while(number != 0){
            result = result + (number%10);
            number = number / 10;
        }
        return result;

    }
}
