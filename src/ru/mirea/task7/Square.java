package ru.mirea.task7;

import java.lang.*;
public class Square extends Rectangle {
    public Square() {
        this.filled = false;
        this.color = "blue";
        this.width = 3;
        this.lenght = 3;
    }

    public Square(double side) {
        this.filled = false;
        this.color = "blue";
        this.width = side;
        this.lenght = side;
    }

    public Square(double side, String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.width = side;
        this.lenght = side;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
    }

    @Override
    public void setWidth(double side) {
        width = side;
        lenght = side;
    }

    @Override
    public void setLength(double side) {
        width = side;
        lenght = side;
    }

    @Override
    public String toString() {
        return "Shape: square, side: " + this.width + ", color: " + this.color;
    }
}
