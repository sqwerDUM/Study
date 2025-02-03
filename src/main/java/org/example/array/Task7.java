package org.example.array;

import java.util.Scanner;

// Максимальное из введеных N чисел
public class Task7 {
    public static int [] array;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        array = new int[n];
        int max = Integer.MIN_VALUE ;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
