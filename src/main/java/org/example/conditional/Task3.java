package org.example.conditional;

import java.util.Scanner;

//          Через терний...
//Эта программа написана с использованием тернарного оператора, но не совсем понятно, что она делает.
//Думаем, если избавиться от тернарного оператора, то станет намного понятнее.
//Перепиши программу без использования тернарного оператора.
//
// Требования:
//    1. Программа должна считывать число с клавиатуры
//    2. Вместо тернарного оператора в программе должен быть использован оператор if
//    3. Функционал программы не должен измениться
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 5) {
            System.out.println("число меньше 5");
        } else if (number == 5) {
            System.out.println("число равно 5");
        } else {
            System.out.println("число больше 5");
        }
    }
}