package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    private static final String EMAIL_REGEX = "[a-zA-Z0-9._]+\\@[A-Za-z0-9]+(\\.[a-zA-Z]+)*";
    public static void main(String[] args) {

        System.out.println(isCorrectEmailFormat("sda@com.pl"));
        System.out.println(isCorrectEmailFormat("sda_1@com.pl"));
        System.out.println(isCorrectEmailFormat("sda_1@@com.pl"));
        System.out.println(isCorrectEmailFormat("@com.pl"));
        System.out.println(isCorrectEmailFormat("sda@com."));






    }
    private static boolean isCorrectEmailFormat(String emailAdress) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(emailAdress);
        return matcher.matches();
    }
}

