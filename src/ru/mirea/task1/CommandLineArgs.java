package ru.mirea.task1;

public class CommandLineArgs {
    public static void main(String[] args) {
        for (String str : args) {
            System.out.println("аргумент: " + str);
        }
    }
}
