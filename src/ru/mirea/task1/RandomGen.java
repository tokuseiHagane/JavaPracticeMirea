package ru.mirea.task1;

import java.util.Random;
public class RandomGen {
    public static void main(String[] args) {
        System.out.println("First array:");
        int arr1[] = new int[(int)(Math.random() * 10) + 1];
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = (int)(Math.random() * 100);
            System.out.println(arr1[i]);
        }
        Random random = new Random();
        System.out.println("\nSecond array:");
        int arr2[] = new int[random.nextInt(10) + 1];
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(100);
            System.out.println(arr2[i]);
        }
    }
}
