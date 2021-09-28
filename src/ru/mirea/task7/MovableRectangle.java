package ru.mirea.task7;

import java.lang.*;
public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public boolean sameSpeed() {
        if((bottomRight.xSpeed == topLeft.xSpeed)
                & (bottomRight.ySpeed == topLeft.ySpeed)) return true;
        else return false;
    }
    public void moveUp() {
        if(sameSpeed()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }
    public void moveDown() {
        if(sameSpeed()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }
    public void moveLeft() {
        if(sameSpeed()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }
    public void moveRight() {
        if(sameSpeed()) {
            topLeft.moveRight();
            bottomRight.moveLeft();
        }
    }

    public String toString() {
        return "Rectangle, bottom right corner XY: "
                + this.bottomRight.x + " " + this.bottomRight.y
                + ", top left corner XY: " + this.topLeft.x + " " + this.topLeft.y
                + ", xSpeed and ySpeed: " + this.bottomRight.xSpeed + " " + this.bottomRight.ySpeed;
    }
}
