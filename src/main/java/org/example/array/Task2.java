package org.example.array;
// Четные и нечетные ячейки массива
public class Task2 {
    public static final String ODD = "Нечётный";
    public static final String EVEN = "Чётный";
    public static String[] strings = new String[5];
    public static void main(String[] args) {
// Method 2

       for (int i = 0; i < strings.length; i++) {
           if (i % 2 == 0) {
               strings[i] = EVEN;
           }
           else {
               strings[i] = ODD;
           }
       }
//
//        strings[0] = ODD;
//        strings[1] = ODD;
//        strings[2] = EVEN;
//        strings[3] = ODD;
//        strings[4] = EVEN;


        System.out.print("index = 0");
        System.out.println(" value = " + strings[0]);
        System.out.print("index = 1");
        System.out.println(" value = " + strings[1]);
        System.out.print("index = 2");
        System.out.println(" value = " + strings[2]);
        System.out.print("index = 3");
        System.out.println(" value = " + strings[3]);
        System.out.print("index = 4");
        System.out.println(" value = " + strings[4]);


    }
}
