package ru.mirea.task7;

import java.lang.*;
public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    MovableCircle(int x, int y, int xSpeed, int ySpeed) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public void moveUp() {
        center.moveUp();
    }
    public void moveDown() {
        center.moveDown();
    }
    public void moveLeft() {
        center.moveLeft();
    }
    public void moveRight() {
        center.moveRight();
    }

    public String toString() {
        return "Circle, center XY: "
                + this.center.x + " " + this.center.y
                + ", xSpeed and ySpeed: " + this.center.xSpeed + " " + this.center.ySpeed;
    }
}
