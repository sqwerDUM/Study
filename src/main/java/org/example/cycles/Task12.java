package org.example.cycles;

import java.util.Scanner;

// Сумма кратных чисел
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();

        int sum = 0;
        for (int i = start; i <= end; i++ ) {
            if (i % multiple != 0 || i == end) {
               continue;
            }
            else {
             sum += i;
            }
        }
        System.out.println(sum);
    }
}
