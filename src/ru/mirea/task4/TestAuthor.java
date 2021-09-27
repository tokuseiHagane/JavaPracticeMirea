package ru.mirea.task4;

import java.lang.*;
public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Joanne Rowling", "janne.r.hp@yahoo.uk", 'F');
        Author a2 = new Author("John Ronald Reuel Tolkien", "NONE" , 'M');
        Author a3 = new Author("Aleksandr Evgenyevich Tsypkin", "tsypkin@mail.ru", 'M');
        Author a4 = new Author("Immanuel Kant", "NONE",'M');
        System.out.println(a1.getName());
        System.out.println(a3.getGender());
        a2.setEmail("webmaster@greisinger.museum");
        System.out.println(a2.getEmail());
        System.out.println(a4);
    }
}
