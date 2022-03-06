package pl.sdacademy.java.basic.exercises.day2;

public class Task6 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        char c = 'm';
        System.out.println(searchedPositionOfChar(input, c));

    }

    private static int searchedPositionOfChar(String input, char searchedChar) {
        if (StringHelper.isValid(input) && input.contains(String.valueOf(searchedChar))) {
            int counter = 0;
            for (; counter < input.length(); counter++) {
                if (input.charAt(counter) == searchedChar) {
                    return counter;
                }
            }
        }

        return -1;
    }
}
