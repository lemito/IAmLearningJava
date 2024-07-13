package ru.lemito;

public class Strings {
    public static void main(String[] args) {
        char letter = 'a';
        char letter_number = 231;
        System.out.println(letter + " " + letter_number);

        String str = "meow mew " + "mew";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(2));
        String str2 = "meow mew mew ";
        System.out.println(str.equals(str2));
        System.out.println(str == str2);
    }
}
