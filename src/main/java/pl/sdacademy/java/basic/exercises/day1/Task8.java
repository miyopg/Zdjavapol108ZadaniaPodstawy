package pl.sdacademy.java.basic.exercises.day1;

public class Task8 {
    public static void main(String[] args) {
        int rangeTo = 20;
        System.out.println("Range from 1 to " + rangeTo);
        for(int i = 1; i <= rangeTo; i++) {
            String result = fizzBuzz(i);
            System.out.println(result);
        }
    }
    private static String fizzBuzz(int number) {
        if(number%15 == 0) {
            return "fizzBuzz";
        } else if(number%3 == 0) {
            return "fizz";
        } else if(number%5 == 0) {
            return "Buzz";
        }

        return String.valueOf(number);
    }
}
