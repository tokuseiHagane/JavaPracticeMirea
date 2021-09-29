package ru.mirea.task2;

import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("America", "basketball", 6700, 8);
        Ball b2 = new Ball("Ukrain", "soccer", 1200);
        Ball b3 = new Ball("Russia");
        Ball b4 = new Ball();
        System.out.println(b4.getUsage());
        b3.setCost(450);
        System.out.println(b1);
        b1.calcCurrentCost();
    }
}
