package ru.mirea.task10;

import java.util.Scanner;

public class Nine {
    // Без двух нулей
    public static void main(String[] args) {
        System.out.println("Задание 9");
        System.out.print("Введите количество 0 и 1 соответственно: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Количество возможных последовательностей: " + noneTwoZero(a, b));

    }

    public static int noneTwoZero(int zeros, int ones)
    {
        if (zeros - 1 > ones)
            return 0;

        if (zeros == 0 || ones == 0)
            return 1;

        if (zeros == 1)
            return ones + 1;
        else
            return noneTwoZero(zeros - 1, ones - 1) + noneTwoZero(zeros, ones - 1);
    }
}
