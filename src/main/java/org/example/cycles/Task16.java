package org.example.cycles;

import java.util.Scanner;

// Share a Coke
public class Task16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        double current = 1.0 * n / m;
        System.out.println(current);
    }
}
