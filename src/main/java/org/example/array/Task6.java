package org.example.array;

import java.util.Scanner;

//  Минимальное из N чисел
public class Task6 {
    public static int [] array;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        array = new int[n];
        int min = Integer.MAX_VALUE ;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            if (array[i] < min) {
                min = array[i];
            }
            }
        System.out.println(min);
        }
    }

