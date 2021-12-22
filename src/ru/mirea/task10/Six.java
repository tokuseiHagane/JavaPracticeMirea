package ru.mirea.task10;

import java.util.Scanner;

public class Six {
    // Простое число
    public static void main(String[] args) {
        System.out.println("Задание 6");
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int n;
        n = Integer.parseInt(sc.nextLine());
        if (is_prime(n, 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean is_prime(int n, int div) {
        if (n == div)
            return true;
        if (n % div == 0)
            return false;

        return is_prime(n, div + 1);
    }
}
