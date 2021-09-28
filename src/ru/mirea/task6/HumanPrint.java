package ru.mirea.task6;

public class HumanPrint implements Nameable{
    protected String name;
    HumanPrint(String name) {
        this.name = name;
    }
    HumanPrint() {
        this.name = "Robert";
    }

    public String getName() {
        return this.name;
    }
}
