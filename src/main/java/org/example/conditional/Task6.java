package org.example.conditional;
// Сравнение строк по ссылке
//В методе main напиши код попарного сравнения по ссылке строк string1, string2 и string3 с выводом соответствующего сообщения после каждого сравнения:
//"ссылки на строки одинаковые" или "ссылки на строки разные".
//
//Порядок сравнения должен быть следующим:
//- строку string1 со строкой string2
//- строку string2 со строкой string3
//- строку string1 со строкой string3.
// Требование:
//   1. Поля string1, string2 и string3 и их значения изменять нельзя
//   2. В методе main должно быть сравнение строк string1 и string2 по ссылке
//   3. В методе main должно быть сравнение строк string2 и string3 по Ссылке
//   4. В метоле main должно быть сравнение строк string1 и string3 по ссылке
//   5. программа должна выводить соответствующие сообщения на экран
//   6. Программа должна выводить на экран 3 строки.


public class Task6 {
    public static String string1 = "Амиго";
    public static String string2 = string1;
    public static String string3 = new String(string1);

    public static void main(String[] args) {
        String same = "ссылки на строки одинаковые";
        String different = "ссылки на строки разные";
        //напишите тут ваш код
        if (string1 == string2) {
            System.out.println(same);
        } else {
            System.out.println(different);
        }
        if (string2 == string3) {
            System.out.println(same);
        } else {
            System.out.println(different);
        }
        if (string1 == string3) {
            System.out.println(same);
        } else {
            System.out.println(different);
        }
    }
}
