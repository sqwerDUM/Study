package org.example.array;

import java.util.Scanner;

//  Revers
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();

            }
            if (n % 2 == 0 && n > 0) {
                for (int i = n; i > 0; ) {
                    i--;
                    System.out.println(array[i]);
                }
            } else {
                for (int i = 0; i < array.length; i++) {
                    System.out.println(array[i]);
                }
            }
        }
    }
}
