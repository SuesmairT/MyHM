package org.example;

public class Task2 {
    public static void main(String[] args) {
//        Вывести на экран в одну строку все нечётные числа от 0 до 100.  while
       int i = 0;
       while (i <= 100) {
           if ( i%2 != 0) {
               System.out.print(i + " ");
               }
           i++;
       }

    }
}
