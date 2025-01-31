package org.example.cycles;

import java.util.Scanner;

// Скорость ветра
public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int speed = Math.round(n * 3.6f);
        System.out.println(speed);
    }
}
