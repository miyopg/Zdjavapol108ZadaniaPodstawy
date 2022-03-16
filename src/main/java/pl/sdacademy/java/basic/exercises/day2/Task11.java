package pl.sdacademy.java.basic.exercises.day2;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        int[] inputs = {12, -7, 19, -5, -9};
        int lengthOfNewArray = countNegativeValues(inputs);
        System.out.println("Liczby ujemne: " + countNegativeValues(inputs));
        if(lengthOfNewArray > 0) {
           int[] negativeValues = createArrayWithOnlyNegativeValues(inputs, lengthOfNewArray);
            System.out.println(Arrays.toString(negativeValues));
        }


    }
    private static int[] createArrayWithOnlyNegativeValues(int[] inputs, int lengthOfNewArray) {
        int[] result = new int[lengthOfNewArray];
        int count = 0;
        for(int element : inputs) {
            if(element < 0) {
                result[count] = element;
                count++;
            }
        }
        return result;
    }
    private static int countNegativeValues(int[] inputs) {
        int count = 0;
        for(int element : inputs) {
            if(element < 0) {
                count++;
            }
        }
        return count;
    }
}
