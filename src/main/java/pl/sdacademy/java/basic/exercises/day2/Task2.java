package pl.sdacademy.java.basic.exercises.day2;

public class Task2 {
    public static void main(String[] args) {
        String prefix = "pro";
        String input = "programowanie";
        System.out.println("Prefix: " + prefix);
        System.out.println("input: " + input);
        System.out.println("Result: " + isWordContainsPrefix(input, prefix));

        prefix = "nie";
        input = "";
        System.out.println("Prefix: " + prefix);
        System.out.println("input: " + input);
        System.out.println("Result: " + isWordContainsPrefix(input, prefix));

        prefix = "nie";
        input = null;
        System.out.println("Prefix: " + prefix);
        System.out.println("input: " + input);
        System.out.println("Result: " + isWordContainsPrefix(input, prefix));

        prefix = null;
        input = "programowanie";
        System.out.println("Prefix: " + prefix);
        System.out.println("input: " + input);
        System.out.println("Result: " + isWordContainsPrefix(input, prefix));

    }

    public static boolean isWordContainsPrefix(String input, String prefix) {
     /*   if (isValid(input) && !input.isBlank() && prefix != null && !prefix.isBlank()) {
            return input.startsWith(prefix);

        }
        return false;*/
        return isValid(input) && isValid(prefix) ? input.startsWith(prefix) : false;
    }

    private static boolean isValid(String input) {
        return input != null && !input.isBlank(); // operator trójargumentowy
        // logika (zwracam true albo false) ? operacja gry true : operacja gdy false

    }
}