package org.example.cycles;
//  Запрлненный прямоугольник
//Используя вложенные циклы while (цикл в цикле) выведи на экран прямоугольник размером 5 (высота) на 10 (ширина),
//заполненный буквой 'Q'.
//
//Пример вывода:
//        QQQQQQQQQQ
//        QQQQQQQQQQ
//        QQQQQQQQQQ
//        QQQQQQQQQQ
//        QQQQQQQQQQ
// Требования:
//    1. Программа должна выводить текст на экран
//    2. Программа должна выводить прямоугольник высотой 5 и шириной 10, заполненный буквами 'Q'
//    3. В программе необходимо использовать вложенный циклы while (цикл в цикле)
//    4. Вывод на жкран должен происходить через в цикле while


public class Task4 {
    public static void main(String[] args) {
        int i = 0;
        while (i<5) {
           int j = 0;
            while (j<10) {
                System.out.print("Q");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
