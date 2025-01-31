package org.example.conditional;
//        Ищем максимум
//У нас есть программа, которая считывает с клавиатуры два числа и выводит на экран большее из них.
//Если числа одинаковые, то выводится любое.
//Перепиши программу с использованием тернарного оператора, чтобы ее функционал остался без изменений.
//
//                Требования:
//       1. Программа должна считывать два числа с клавиатуры
//       2. Вместо оператора if-else нужно использовать тернарный оператор
//       3. Функционал программы не должен измениться

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        int max = numberA > numberB ? numberA : numberB;

        System.out.println(max);

    }
}
