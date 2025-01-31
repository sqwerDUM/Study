package org.example.conditional;

import java.util.Scanner;

//          Высокая точность
//Напиши программу, которая считывает с клавиатуры два вещественных числа (double) и выдает сообщение о том,
//равны ли эти числа с точностью до одной миллионной.
// Требования:
//    1. Программа должна считывать два числа с клавиатуры.
//    2. Если числа равных, то программа должна вывести сообщения "числа равны"
//    3. Если числа не равны, то программа должна вывести сообщение "числа не равны"
//    4. Точность сравнения должна достигать одной миллионной (0.000001).
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if(Math.abs(a - b) < 0.0000001)
        System.out.println("числа равны");
        else
        System.out.println("числа не равны");
    }
}
