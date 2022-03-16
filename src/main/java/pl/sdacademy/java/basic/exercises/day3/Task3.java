package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    // [0-9] => \d
    // [a-zA-z] => \w
    private static final String NUMBER_REGEX = "-?\\d+(,\\d+)?";
    public static void main(String[] args) {
       /* true:
        "1234,1234"
        "1234"
        "-1234"

        false:
        "1234a1234"
        ",1234"
        "1234,"
        ","
        ""
        "a"*/

        System.out.println(isCorrectNumberFormat("1234,1234"));
        System.out.println(isCorrectNumberFormat("1234"));
        System.out.println(isCorrectNumberFormat("-1234"));
        System.out.println();
        System.out.println(isCorrectNumberFormat("1234a1234"));
        System.out.println(isCorrectNumberFormat("1234,"));
        System.out.println(isCorrectNumberFormat(","));
        System.out.println(isCorrectNumberFormat(""));
        System.out.println(isCorrectNumberFormat("a"));

    }
    private static boolean isCorrectNumberFormat(String number){
        Pattern pattern = Pattern.compile(NUMBER_REGEX);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }
}
