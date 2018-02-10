package course_datlab;

import java.util.Scanner;

public class Urok_2_Fibonacci_Main {

    /*public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите любое число: ");
        int n = s.nextInt();
        int a = 1;
        int b = 1;
        int fib = 2;
        int i = 2;
        System.out.println("Фибоначчи числа " + n + ":" );
        System.out.print(a + " " + b);
        while (i < n) {
            fib = a + b;
            a = b;
            b = fib;
            i++;
            System.out.print(" "+ fib);
        }
    }*/
    public static void main(String[] args) {
        int n = 10;
        int a = 1, b = 1;
        System.out.print(a + " " + b);
        int fib = 2, i = 2;
        while (i < n) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.print(" " + fib);
            i++;
        }
    }}
