package ru.mirea.task4;

import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        Ball b2 = new Ball(3.5, 2.3);
        System.out.println(b1);
        b1.move(30, 15);
        System.out.println(b1);
        System.out.println("\n");
        System.out.println(b2);
        b2.move(15, -10);
        System.out.println(b2);
    }
}
