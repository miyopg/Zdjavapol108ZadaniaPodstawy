package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    private static final String IBAN = "PL[0-9]{26}";
    public static void main(String[] args) {
        System.out.println(isCorrectIbanNumber("PL78101010230000261395200000"));
        System.out.println(isCorrectIbanNumber("AL47212110090000000235698741"));
        System.out.println(isCorrectIbanNumber("A47212110090000000235698741"));
        System.out.println(isCorrectIbanNumber("4721211009000000220235698741"));
        System.out.println(isCorrectIbanNumber("HR21211009000000220235698741"));

    }
    private static boolean isCorrectIbanNumber(String iban){
        Pattern pattern = Pattern.compile(IBAN);
        Matcher matcher = pattern.matcher(iban);
        return matcher.matches();
    }
}
