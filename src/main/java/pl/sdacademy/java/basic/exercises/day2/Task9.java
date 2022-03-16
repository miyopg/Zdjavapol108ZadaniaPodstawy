package pl.sdacademy.java.basic.exercises.day2;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {

        // DEKLAROWANIE TABLICY JEDNOWYMIAROWEJ

        // SPOSÓB 1

        int[] inputs = new int[3];
        inputs[0] = 5;
        inputs[1] = 12;
        inputs[2] = 7;

        // SPOSÓB 2 i pętla for

        int[] inputs2 = {5, 12, 7};

        int[] inputs3 = new int[10];
        for(int i = 0; i < inputs3.length; i++) {
            inputs3[i] = i;
            System.out.print(inputs3[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(inputs3));
        System.out.println();

        // SPOSÓB 3, pętla for each

        for(int element : inputs3) {
            System.out.print(element + " ");
        }
    }

}
