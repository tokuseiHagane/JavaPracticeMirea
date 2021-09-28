package ru.mirea.task6;

public class TestPriceable {
    public static void main(String[] args) {
        Priceable p1 = new CarPrice(200000);
        Priceable p2 = new CarPrice();
        System.out.println(p1.getPrice());
        System.out.println(p2.getPrice());
        p1 = new HousePrice(20000000);
        p2 = new HousePrice();
        System.out.println(p1.getPrice());
        System.out.println(p2.getPrice());
    }
}
