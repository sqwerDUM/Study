package org.example.array;

import java.util.Scanner;

public class Task8 {
    public static String [] strings;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        strings = new String[5];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = sc.nextLine();
        }
        for (int i = strings.length; i >= 0; i--) {
            for (int j = 0; j < strings.length; j++) {
            if (strings[j].equals(strings[i])) {
                strings[j] = null;
                strings[i] = null;
            }
                System.out.print(strings[i] + ", ");
            }


        }
    }
}
