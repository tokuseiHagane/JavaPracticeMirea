package ru.mirea.task6;

public class HousePrice implements Priceable{
    protected int price;
    HousePrice(int price) {
        this.price = price;
    }
    HousePrice() {
        this.price = 500000;
    }

    public int getPrice() {
        return this.price;
    }
}
