package ru.mirea.task2;

import java.lang.*;
public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Shape("red", "rectangle", false);
        Shape s2 = new Shape("blue", "circle", false);
        s1.getShape();
        s1.getColor();
        System.out.println(s1);
        System.out.println(s2);
    }
}
