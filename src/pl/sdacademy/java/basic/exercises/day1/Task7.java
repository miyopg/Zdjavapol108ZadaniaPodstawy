package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task7 {
    private static final String STOP_DECISION = "stop";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    String decision;
     do {
        System.out.print("Podaj pierwszą liczbę: ");
        float firstNumber = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Proszę podaj jeden ze znaków (+ - / *) : ");
        String operator = scanner.nextLine();

        System.out.print("Podaj drugą liczbę: ");
        float secondNumber = scanner.nextFloat();

        float result = calculate(firstNumber, secondNumber, operator);
        System.out.println("Result: " + result);
        System.out.println();

        System.out.println("New calculation or Stop?");
        decision = scanner.nextLine();

    } while (!STOP_DECISION.equals(decision));
/*       char sign1 = sign.charAt(0);
         if((sign1 == '*') || (sign1 == '/') || (sign1 == '+') || (sign1 == '-')){
            System.out.print("Podaj drugą liczbę: ");
            float secondNumber = scanner.nextFloat();
            System.out.println(firstNumber + sign1 + secondNumber);
        } else {
            System.out.println("Zły operator");
            System.exit(1);
        }
*/


    }
    private static float calculate(float firstDigit, float secondDigit, String operator) {
        float result = 0;
        switch (operator) {
            case "+":
               result = firstDigit + secondDigit;
               break;
            case "-":
                result = firstDigit - secondDigit;
                break;
            case "*":
                result = firstDigit * secondDigit;
                break;
            case "/":
                if(secondDigit == 0) {
                    System.out.println("Wrong operation");
                    System.exit(1);
                }
                result = firstDigit / secondDigit;
                break;
            default:
                System.out.println("Operator not exist");
                System.exit(1);
        }
        return result;
    }

}
