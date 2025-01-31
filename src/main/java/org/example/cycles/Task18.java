package org.example.cycles;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

// Бокал наполовину пуст или наполовину полон?
public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double glass = 0.5;
        Boolean whoYou = sc.nextBoolean();
        if (whoYou) {
            int a = (int)Math.ceil(glass);
            System.out.println(a);
        }
        else {
            int b = (int)Math.floor(glass);
            System.out.println(b);
        }
    }

}
