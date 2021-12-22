package ru.mirea.task10;

import java.util.Scanner;

public class Ten {
    public static int recursion(int n, int i) {
        return (n==0) ? i : recursion( n/10, i*10 + n%10 );
    }
    public static void main(String[] args) {
        System.out.println("Задание 10");
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int n;
        n = Integer.parseInt(sc.nextLine());
        System.out.println(recursion(n, 0));
    }
}
