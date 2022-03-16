package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        insert();
    }
    public static void insert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert first digit: ");
        int firstDigit = scanner.nextInt();
        System.out.println("Please insert second digit: ");
        int secondDigit = scanner.nextInt();

        if(firstDigit < secondDigit) {
            int sum = sum2(firstDigit, secondDigit);
            System.out.println(sum);
        } else {
            System.out.println("Error");
        }
    }
    // pętla for
    private static int sum(int firstDigit, int secondDigit) {
        int sum= 0;
        for(; firstDigit <= secondDigit; firstDigit++){
            sum += firstDigit;
        }
        return sum;
    }

    // pętla while
    private static int sum1(int firstDigit, int secondDigit) {
        int sum1 = 0;
    while(firstDigit <= secondDigit) {
        sum1 += firstDigit;
        firstDigit++;

    }return sum1;
    }
    // pętla do while
    private  static int sum2(int firstDigit, int secondDigit) {
        int sum = 0;
        do {
            sum += firstDigit;
            firstDigit++;
        } while (firstDigit <= secondDigit);
        return sum;
    }



}
