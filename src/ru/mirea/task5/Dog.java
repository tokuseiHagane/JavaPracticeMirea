package ru.mirea.task5;

public abstract class Dog {
    protected String name;
    protected int age;

    public String toString()
    {
        return("Имя: " + name + ", возраст: " + age);
    }
}
