package ru.mirea.task1;

public class FirstTen {
    public static void main(String[] args) {
        double prevSum, currentSum, epsilon = 1E-6;
        int n = 1;
        currentSum = 1.0 / n;
        do {
            prevSum = currentSum;
            currentSum += 1. / ++n;
            System.out.printf("Number #%s = %s\n", n-1, currentSum);
        } while (Math.abs(prevSum - currentSum) > epsilon && n - 1 < 10);
    }
}
