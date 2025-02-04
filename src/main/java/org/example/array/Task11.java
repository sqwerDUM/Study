package org.example.array;

import java.util.Scanner;

public class Task11 {
    public static int [][] multiArray;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        multiArray = new int[rows] [];
            for (int i = 0; i < multiArray.length; i++) {
                for(int j = 0; j < multiArray[i].length; j++ ) {
                    int cols = sc.nextInt();
                    multiArray = new int [rows] [cols];
                    System.out.print(multiArray[i][j] + " ");
                }
                System.out.println();
            }



    }
}
