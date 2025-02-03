package org.example.array;
// Таблица умножения
public class Task9 {
    public static int [][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {

        MULTIPLICATION_TABLE = new int [10][10];
        int [] data = {1,2,3,4,5,6,7,8,9,10};
        int [] data2 = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < 10; i++) {
          for (int j = 0; j < 10; j++) {
            MULTIPLICATION_TABLE[i][j] =data[i] * data2[j];
              System.out.print(MULTIPLICATION_TABLE[i][j] + ", " );
          }
            System.out.println();
        }
    }
}
