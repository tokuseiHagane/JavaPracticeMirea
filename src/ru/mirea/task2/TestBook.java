package ru.mirea.task2;

import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("'Road to the dream'", "Voitenko", 400, "sport");
        Book b2 = new Book("'Modern death'", "Helen Klark", 250);
        Book b3 = new Book("'Roadside picnic'");
        Book b4 = new Book();
        System.out.println(b2.getTitle());
        b4.setCost(1000);
        System.out.println(b3);
    }
}
