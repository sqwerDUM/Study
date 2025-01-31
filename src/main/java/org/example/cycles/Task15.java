package org.example.cycles;

import java.util.Scanner;

//          площадь круга
public class Task15 {
    public static final double PI = 3.14;
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int radius = in.nextInt();
    double calculet =  radius * radius * PI;
    int area = (int)calculet;
        System.out.println(area);
    }
}
