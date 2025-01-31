package org.example.cycles;

import java.util.Scanner;

// Суммирование
//Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму,
//пока пользователь не введет слово "ENTER". Вывести на экран полученную сумму и завершить программу.
// Требования:
//    1. Программа должна считывать данные с клавиатуры
//    2. Необходимо посчитать сумму введенных целых числел и вывести ее на экран, если пользователь ввел стоп слово.
//    3. В программе необходимо использовать цикл while.
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        boolean isExit = false;

        while (!isExit) {
            String s = sc.nextLine();
            if (s.equals("ENTER")){
                isExit = true;
            }
            else {
                sum = sum + Integer.parseInt(s);
            }
        }
        System.out.println(sum);
    }
}
