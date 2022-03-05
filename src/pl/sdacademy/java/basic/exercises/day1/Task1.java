package pl.sdacademy.java.basic.exercises.day1;

public class Task1 {

    public static void main(String[] args) {
        displayWordUsingDecimalFormat();
        Task1 task1 = new Task1(); // aby wywołać metode nie statyczną trzeba stworzyć obiekt tej klasy
        task1.displayWordUsingBinaryFormat(); // wywołanie metody nie statycznej
        displayWordUsingHexFormat();
    }

    private static void displayWordUsingDecimalFormat() { // format dziesiętny
        char s = 83; // s = 83
        char d = 68; // d = 68
        char a = 65;  // a = 65
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
        System.out.println();
    }

    private void displayWordUsingBinaryFormat () { // format binarny dodajemy 0b przed znakiem w formie binarnej aby wyswietlić
        char s = 0b01010011;
        char d = 0b01000100;
        char a = 0b01000001;
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
        System.out.println();
    }

    private static void displayWordUsingHexFormat () { // format binarny dodajemy 0x przed znakiem w formie binarnej aby wyswietlić
        char s = 0x53;
        char d = 0x44;
        char a = 0x41;
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
        System.out.println();
    }
}
