package pl.sdacademy.java.basic.exercises.day2;

public class Task4 {
    private static final String REPLACEMENT = "-STOP-";
    private static final String REGEX = "[,.]";
    public static void main(String[] args) {
        String input = "Ala, ma kota. Kot, ma Ale.";
        System.out.println(replaceText(input));

    }
    private static String replaceText(String input) {
        if(StringHelper.isValid(input)) {
            //return input = input.replace(".", REPLACEMENT).replace(",", REPLACEMENT); // to samo co niżej tylko bez regexu
            return input.replaceAll(REGEX, REPLACEMENT);
        }
        return input;
    }
}
