package ru.mirea.task13;

import java.util.LinkedList;

public class LinkedListCheck {
    public static void main(String[] args) {
        String str1 = new String("Unded");
        String str2 = new String("You're Gonna Go Far Kid");
        String str3 = new String("Пора возвращаться домой");
        String str4 = new String("Hyper Reality Show");

        //инициализация
        LinkedList<String> songs = new LinkedList<>();
        //заполнение
        songs.add(str1);
        songs.add(str2);
        songs.add(str3);
        songs.add(str4);
        System.out.println(songs);
        System.out.println();
        //с индексами
        songs.add(str1);
        songs.add(str3);
        songs.add(1, str2);
        System.out.println(songs);
        System.out.println();
        //удаление элементов
        songs.remove(1);
        System.out.println(songs);
    }
}
