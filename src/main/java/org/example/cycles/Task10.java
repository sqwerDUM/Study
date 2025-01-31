package org.example.cycles;
// Второе минимальное число из введенных

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int min = Integer.MAX_VALUE;
    while (sc.hasNextInt()) {
        int n = sc.nextInt();
        if (n < min)
            min = n;
    }
        System.out.println(min);
    }
}
