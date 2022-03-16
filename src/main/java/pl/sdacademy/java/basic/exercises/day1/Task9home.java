package pl.sdacademy.java.basic.exercises.day1;

import java.math.BigInteger;
import java.util.Scanner;

public class Task9home {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();
        result(range);


    }
        private static void result (int range) {

            int i = 2;
            for (; i < range; i++) {
                int divisor = 2;
                boolean numberFirst = true;
                if (i > 3) {
                    while (divisor < i) {
                        if (i % divisor == 0) {
                            numberFirst = false;
                            break;
                        }
                        divisor++;
                    }
                }
                if (numberFirst) {

                    System.out.println(i);

                }
            }


      }
}



