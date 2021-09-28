package ru.mirea.task7;

import java.math.*;
public class Rectangle extends Shape {
    protected double width;
    protected double lenght;

    public Rectangle() {
        this.filled = false;
        this.color = "blue";
        this.width = 3;
        this.lenght = 3;
    }

    public Rectangle(double width, double lenght) {
        this.filled = false;
        this.color = "blue";
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(double width, double lenght, String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return lenght;
    }

    public void setLength(double lenght) {
        this.lenght = lenght;
    }
    @Override
    public double getArea() {
        return width * lenght;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + lenght);
    }

    @Override
    public String toString() {
        return "Shape: rectangle, width: " + this.width + ", lenght: " + this.lenght + ", color: " + this.color;
    }
}
