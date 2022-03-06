package pl.sdacademy.java.basic.exercises.day2;

public class Task1 {
    public static final char DEFAULT_CHAR = '\u0000';

    public static void main(String[] args) {
        String input = "domek    ";
        char result = getLastChar(input);
        System.out.println("original Char: " + input);
        System.out.println("last char: " + result);

        input = null;
        result = getLastChar(input);
        System.out.println("original Char: " + input);
        System.out.println("last char: " + result);
    }
    private static char getLastChar(String input) {
        if( input != null && !input.isBlank()) {
            String inputWithoutTrim = input.trim();
            int lastPosition = inputWithoutTrim.length() - 1;
            return inputWithoutTrim.charAt(lastPosition);
        }
       return DEFAULT_CHAR;
    }
}
