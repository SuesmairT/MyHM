package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        byte a = 100; //1 байт (-128 до 127)
        short s = 500; //2 байта (-30 000 до + 30 000)
        int w = 1100000; // 4 байта (-2 000 000 000 до + 2 000 000 000)
        long l = 3000000000L; // 8 байт (-9 10^18 до +9 10^18)

        float f = 1235000.123f; //4 байта
        double g = 123000000000000.123; //8 байт

        System.out.println(f);
        System.out.println(g);
        System.out.println(a % 3);

        System.out.println(s >= a);

        char c = '1'; //2 байта

        boolean bool = false; //1 байт

        int i = 0;
        while (i <= a) {
            System.out.println("Выполняется действие");
            i = i + 1;
        }

        System.out.println(i);
        do {
            System.out.println("Выполняется действие цикла do-while");
            i = i + 1;
        } while (i <= 12);


        while (i <= a) {
            System.out.println("!!!!!!!!!");
            i = i + 1;
        }

        // Вывести на экран числа от 0 до 100
        int step = 0;

        while (step <= 100) {
            System.out.print(step + ", ");
            step = step + 1;
        }

        System.out.println();

        System.out.println("1111111");

//        Вывести на экран в одну строку все нечётные числа от 0 до 100.


    }
}
