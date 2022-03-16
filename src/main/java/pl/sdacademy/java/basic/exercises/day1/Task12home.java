package pl.sdacademy.java.basic.exercises.day1;

public class Task12home {

    public static void main(String[] args) {
    int a = 224;
    int b =4;

        System.out.println(ownModuloImplementation(a, b));
        System.out.println(ifOwnModuloImplementationIsCorrect(a, b));
    }

    private static int ownModuloImplementation(int a, int b) {


        return a - (a / b) * b;
    }

    private static boolean ifOwnModuloImplementationIsCorrect(int a, int b) {

        return ownModuloImplementation(a, b) == ( a%b );
    }
}
