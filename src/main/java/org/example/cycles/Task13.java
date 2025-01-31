package org.example.cycles;
//          Рисуем треугольник
public class Task13 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("8");
            }
            if (i < 10) {
                System.out.println();
            }
        }
    }
}
