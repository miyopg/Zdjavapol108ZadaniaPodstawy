package pl.sdacademy.java.basic.exercises.day3;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {
        stoper();
    }
    private static void stoper() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pomiar czasu rozpoczyna sie od wciśnięcia klawisza ENTER");
        scanner.nextLine();
        LocalTime startTime = LocalTime.now();
        System.out.print("W celu zatrzymania pomiaru należy ponownie wcisnąć klawisz ENTER");
        scanner.nextLine();
        LocalTime stopTime = LocalTime.now();
        long seconds = Duration.between(startTime, stopTime).getSeconds();
        System.out.println("Różnica czasu: " + seconds);


    }
}
