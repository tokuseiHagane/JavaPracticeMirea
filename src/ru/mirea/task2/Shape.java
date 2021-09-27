package ru.mirea.task2;

public class Shape {
    protected String color;
    protected String shape;
    protected boolean filled;
    Shape(String color, String shape, boolean filled)
    {
        this.shape = shape;
        this.color = color;
        this.filled = filled;
    }
    Shape()
    {
        this.shape = "circle";
        this.color = "red";
        this.filled = false;
    }

    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getShape() {
        return this.shape;
    }
    public void setShape(String shape) {
        this.shape = shape;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public boolean isFilled() {
        return this.filled;
    }

    public String toString() {
        return "Shape: " + this.shape + ", color: " + this.color + ", filled: " + this.filled;
    };
}
