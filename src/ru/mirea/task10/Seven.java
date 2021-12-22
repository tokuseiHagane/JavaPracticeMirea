package ru.mirea.task10;

import java.util.Scanner;

public class Seven {
    // Печать простых множителей
    public static void main(String[] args) {
        System.out.println("Задание 7");
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int n;
        n = Integer.parseInt(sc.nextLine());
        print_number_factor(n, 2);
        System.out.println();
    }
    public static void print_number_factor(int n, int div)
    {
        if (n == 1)
            return;

        if (n % div == 0)
        {
            System.out.print(div + " ");
            print_number_factor(n/div, div);
        }
        else
        {
            print_number_factor(n, div+1);
        }

    }
}
