package pl.sdacademy.java.basic.exercises.day2;

public class Task7 {

    public static final char SPACE_SIGN = ' ';

    public static void main(String[] args) {
        String input = "Ala ma kota ale nie ma psa";
        System.out.println(procentOfSpaces(input));

    }
    private static double procentOfSpaces(String input) {
        if (StringHelper.isValid(input)) {
            double signCount = 0;
            for(int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == SPACE_SIGN) {
                    signCount++;
                }
            }
            return (signCount / input.length()) * 100;
        }
        return 0;
    }
}
