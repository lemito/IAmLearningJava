package ru.lemito;

import java.util.Locale;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        console.useLocale(Locale.US); 
        String name = console.nextLine();
        int age = console.nextInt();
        double gpa = console.nextDouble();
        System.out.println("Hello, " + name + ", your age = " + age + ", gpa = " + gpa);

        String str = "19 4.87";
        Scanner fromStr = new Scanner(str);
        fromStr.useLocale(Locale.US); 
        int age_fromStr = fromStr.nextInt();
        double gpa_fromStr = fromStr.nextDouble();
        System.out.println(", your age = " + age_fromStr + ", gpa = " + gpa_fromStr);
    }
}
