package org.example;

public class Calc {
    public static void main(String[] args) {
        char znak = '+';
        double a = 4;
        double b = 13;
        switch(znak)
        {
            case '+' :
                System.out.println(a + b);
            case '-' :
                System.out.println(a - b);
            case '*' :
                System.out.println(a * b);
            case '/' :
                System.out.println(a / b);
            default:
                System.out.println("Error");
        }
    }
}
