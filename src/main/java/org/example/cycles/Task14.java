package org.example.cycles;

import java.util.Scanner;

//          Хорошего не бывает много
public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String stroka = in.nextLine();
        int number = in.nextInt();
        do {
            System.out.println(stroka);
            number--;
        } while (number > 0  && number < 4);
    }
}
