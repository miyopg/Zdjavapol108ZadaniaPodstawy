package pl.sdacademy.java.basic.exercises.day2;

public class Task8 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("sedes"));
        System.out.println(isPalindrome("cosinnego"));
        System.out.println();
        /*String text = "kajak";
        System.out.println(new StringBuilder(text).reverse().toString().equals(text));*/
        System.out.println();
        System.out.println(isPalindrome2("sedes"));
        System.out.println(isPalindrome2("cosinnego"));


    }
    private static boolean isPalindrome(String text) { // opcja z pętlą
        int length = text.length();
        int last = length - 1;
        for(int i = 0; i < length; i++) {
            if(text.charAt(i) != text.charAt(last)) {
                return false;
            }
            last--;
        }
        return true;
    }
    private static boolean isPalindrome2(String input) { // opcja z StringBuilderem
        StringBuilder palindrome = new StringBuilder(input).reverse();
        return input.equals(palindrome.toString());
    }

}

