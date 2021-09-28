package ru.mirea.task6;

public class CarPrice implements Priceable{
    protected int price;
    CarPrice(int price) {
        this.price = price;
    }
    CarPrice() {
        this.price = 1000000;
    }

    public int getPrice() {
        return this.price;
    }
}
