package ru.lemito;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        int age = console.nextInt();
        System.out.println("Hello, " + name + ", your age = " + age);

        String str = "25.52 55.48 9";
        Scanner fromStr = new Scanner(str);
        boolean check1 = fromStr.hasNextDouble();
//        double first = fromStr.nextDouble();
        boolean check2 = fromStr.hasNextDouble();
//        double second = fromStr.nextDouble();
//        int third = fromStr.nextInt();
//        System.out.println((first + second) / third);
        System.out.println(String.valueOf(check1) + check2);
    }
}
