package ru.mirea.task2;

import java.lang.*;
public class Book {
    private String title;
    private String author;
    private int cost;
    private String genre;

    public Book(String t, String a, int c, String g) {
        title = t;
        author = a;
        cost = c;
        genre = g;
    }

    public Book(String t, String a, int c) {
        title = t;
        author = a;
        cost = c;
        genre = "Novel";
    }
    public Book(String t, String a) {
        title = t;
        author = a;
        cost = 700;
        genre = "Science fiction";
    }
    public Book(String t) {
        title = t;
        author = "Brothers Strugatsky";
        cost = 700;
        genre = "Science fiction";
    }

    public Book() {
        title = "'Criticism of pure vision'";
        author = "Immanuel Kant";
        cost = 600;
        genre = "Philosophy";
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getCost() {
        return cost;
    }

    public String toString() {
        return "Title is " + this.title + ", " + this.author + ", cost's " + this.cost + ", " + this.genre;
    }
}
