package ru.lemito;

import java.util.Arrays;
import java.util.Scanner;

public class StaticArray {
    public static void main(String[] args) {
        // еще не массивы
        int[] meow;
        int[] meoww;
        // ==============
        meow = new int[3];
        meoww = new int[10];
        meow[0] = 0;
        meow[1] = 1;
        meow[2] = 2;
        int[] meowww = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // ============= 
        // всякий вывод
        String meowww_str = Arrays.toString(meowww);
        System.out.println(meowww_str);
        int n = meowww.length;
        for (int i = 0; i < n; ++i){
            System.out.print(meowww[i] + " ");
        }
        System.out.println();
        for (int j : meowww) {
            System.out.print(j + " ");
        }
        System.out.println();
        // =============
        // ввод с клавы
        Scanner sc = new Scanner(System.in);
        int n2 = meoww.length;
        for (int i = 0; i < n2; ++i){
            meoww[i] = sc.nextInt();
        }
        for (int j : meoww) {
            System.out.print(j + " ");
        }
    }
}

