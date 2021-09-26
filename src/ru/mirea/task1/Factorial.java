package ru.mirea.task1;

public class Factorial {
    public static int getFactorial(int f) {
        int res = 1;
        for (int i = 1; i <= f; i++) {
            res = res * i;
        }
        return res;
    }
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            System.out.printf("!%s = %s\n", i , getFactorial(i));
        }
    }
}
