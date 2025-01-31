package org.example.conditional;

import java.util.Scanner;

// Сравним строки
//Напиши программу, которая считывает с клавиатуры две строки и выдает сообщение о том, одинаковые ли эти строки.
// Требования:
//    1. Программа должна считывать две строки с клавиатуры.
//    2. Если строки одинаковые, то программа должна вывести сообщение "строки одинаковые"
//    3. Если строки разные, то программа должна вывести сообщение "строки разные"
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if (str1.equals(str2)) {
            System.out.println("строки одинаковые");
        }
     else
        System.out.println("строки разные");
    }
}
