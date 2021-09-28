package ru.mirea.task6;

public class CarPrint implements Nameable{
    protected String name;
    CarPrint(String name) {
        this.name = name;
    }
    CarPrint() {
        this.name = "Mitsubishi Padjero";
    }

    public String getName() {
        return this.name;
    }
}
