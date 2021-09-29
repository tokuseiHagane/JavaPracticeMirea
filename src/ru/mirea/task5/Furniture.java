package ru.mirea.task5;

public abstract class Furniture {
    protected String material;
    protected String type;
    protected int amount;
    protected int price;

    public String toString (){
        return("Категория товара: " + type + ", материал: " + material +
                ", количество: " + amount + ", цена: " + price + " руб.");
    }
}
