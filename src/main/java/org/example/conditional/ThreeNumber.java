package org.example.conditional;
//Ввести с клавиатуры три целых числа. Определить, есть ли среди них хотя бы одна пара равных между собой чисел.
//Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
//
//Примеры:
//a) при вводе чисел 1 2 2 получим вывод 2 2
//
//b) при вводе чисел 2 2 2 получим вывод 2 2 2

import java.util.Scanner;

// Требования:
//    1.Программа должнасчитывать три числа с клавиатуры
//    2. Программа должна содержать System.out.println() или System.out.print()
//    3. Если два числа равны между собой, необходимо вывести их на экран
//    4. Если все три числа равны между собой, необходимо вывести все три
//    5. Если нет равных чисел, ничего не выводить
public class ThreeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();


        if (a == b && a == c){
            System.out.print(a + " " + c + " " + b);
        }
        else if (c == b) {
            System.out.print(c + " " + b);
        }
        else if (c == a) {
            System.out.print(c + " " + a);
        } else if (a == b) {
            System.out.println(a + " " + b);
        }
    }
}
