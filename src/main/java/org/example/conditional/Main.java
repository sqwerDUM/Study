package org.example.conditional;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final String TRIANGLE_EXISTS = "Треугольк существует";
    private static final String TRIANGLE_NOT_EXISTS = "Треугольк не существует";
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        int triangle = scanner.nextInt();
//        int triangle2 = scanner.nextInt();
//        int triangle3 = scanner.nextInt();
//
//        boolean triangleSide = triangle < (triangle2 + triangle2);
//        boolean triangleSide2 = triangle2 < (triangle3 + triangle);
//        boolean triangleSide3 = triangle3 < (triangle2 + triangle);
//
//        if (triangleSide && triangleSide2 && triangleSide3) {
//            System.out.println(TRIANGLE_EXISTS);
//        }
//        else {
//            System.out.println(TRIANGLE_NOT_EXISTS);
//        }
//          _____________________________________________________________
//        Scanner scanner = new Scanner(System.in);
//        int age = scanner.nextInt();
//        if (age < 20 || age >60  ) {
//            System.out.println("можно не работать");
//        }
//          ______________________________________________________________________'
          Scanner scanner = new Scanner(System.in);
          int x = scanner.nextInt();
          int y = scanner.nextInt();

          if (x > 0 && y > 0) {
              System.out.println("1");
          }
          if (x<0 && y > 0) {
              System.out.println("2");
          }
          if (x < 0 && y < 0) {
              System.out.println("3");
          }
          if (x > 0 && y < 0) {
              System.out.println("4");
          }
        }
    }




