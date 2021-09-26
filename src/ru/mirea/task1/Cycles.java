package ru.mirea.task1;

public class Cycles {
    public static void main(String[] args) {

        int arr1[] = {123, 124, 642, 12224, 7422, 753};
        int sum1 = 0;
        for(int a = 0; a < arr1.length; a++) {
            sum1+=arr1[a];
        }
        System.out.printf("First sum: %s\n", sum1);

        int arr2[] = {-12, 421, -21, 421, -55, 312, 784, 367, 109, -54};
        int sum2 = 0;
        int b = 0;
        while(b < arr2.length) {
            sum2+=arr2[b];
            b++;
        }
        System.out.printf("Second sum: %s\n", sum2);

        int arr3[] = {6523, 87653, 3563, 853, -323467};
        int sum3 = 0;
        int c = 0;
        do {
            sum3+=arr2[c];
            c++;
        } while (c < arr3.length);
        System.out.printf("Third sum: %s\n", sum3);
    }
}
