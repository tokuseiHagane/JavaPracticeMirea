package ru.mirea.task7;

import java.lang.*;
public abstract class Shape {
    protected String color;
    protected boolean filled;
    Shape(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    Shape() { }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return this.filled;
    }

    abstract double getArea();
    abstract double getPerimeter();

    public String toString() {
        return "Shape: none, color: " + this.color + ", filled: " + this.filled;
    };
}
