package pl.sdacademy.java.basic.exercises.day2;

public class Task10 {
    public static void main(String[] args) {
        // Deklaracja tablicy
        int[] inputs = {12, 7, 19, 2};
        // Wyswietlenie metod min i max i sum
        System.out.println(getMinValue(inputs));
        System.out.println(getMaxValue(inputs));
        System.out.println(sum(inputs));
    }
    // Szukanie najmniejszego elementu
    private static int getMinValue(int[] inputs) {
        int minValue = inputs[0];
        for(int element : inputs) {
            if(element < minValue) {
                minValue = element;
            }
        }
        return minValue;
    }
    // Szukanie najwiekszego elementu
    private static int getMaxValue(int[] inputs) {
        int maxValue = inputs[0];
        for(int element : inputs) {
            if(element > maxValue) {
                maxValue = element;
            }
        }
        return maxValue;
    }
    // Obliczanie sumy tablicy
    private static int sum(int[] inputs) {
        int sum = 0;
        for(int i : inputs) {
            sum += i;
        }
        return sum;
    }
}
