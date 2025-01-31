package org.example.cycles;
// Показываем что получилось
//Вводим данные с клавиатуры и сразу их выводим на экран, пока не будет введено слово "enough".
//Слово "enough" выводить не нужно.
//Для этого необходимо использовать бесконечный цикл (while(true)).
//
//Подсказка: чтобы завершить бесконечный цикл, используй оператор break.
//       Требование:
//    1. Программа должна считывать данные с клавиатуры
//    2. В программе необходимо использовать цикл while
//    3. Для завершения бесконечного цикла необходимо использовать оператор break
//    4. Программа должна выводить в консоли все введенные данные с новой строки пока не будет введено слово "enough"

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            String line = in.nextLine();
            if (line.equals("enough")) {
                break;
            }
            System.out.println(line);
        }

    }
}
