package ru.lemito;

public class Methods {
    static void print(int num){
        System.out.println(num);
    }

    static void print(double num){
        System.out.printf("%.3f\n", num);
    }

    static void print(String str){
        System.out.println(str);
    }

    static void print(int[] arr){
        for (int elem: arr) {
            System.out.print(elem + " ");
        }
    }

    public static void main(String[] args){
        print(5);
        print(5.85);
        print("57485");
        print(new int[]{5, 1, 7, 5, 6});
    }
}
