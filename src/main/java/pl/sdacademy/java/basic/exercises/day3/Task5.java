package pl.sdacademy.java.basic.exercises.day3;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Task5 {
    private static final String INPUT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert date [in format [yyyy-MM-dd HH:mm:ss]: ");
        String input = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(INPUT_DATE_FORMAT);
        LocalDateTime nextLesson = LocalDateTime.parse(input, formatter);

        LocalDateTime now = LocalDateTime.now();

        long days = Duration.between(now, nextLesson).toDays();
        System.out.println("You have "+ days + " days to the next lesson");
        System.out.printf("You have %01d days to the next lesson", days);

    }
    private static void nextLesson(String input) {



    }
}
