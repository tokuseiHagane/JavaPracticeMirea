package ru.mirea.task5;

public class Cauldron extends Dish{
    Cauldron(String name, int cost, String inventoryID)
    {
        this.name = name;
        this.cost = cost;
        this.inventoryID = inventoryID;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setCoast(int cost){
        this.cost = cost;
    }
    public int getCost()
    {
        return cost;
    }
    public void setInventoryID(String inventoryID){
        this.inventoryID = inventoryID;
    }
    public String getInventoryID()
    {
        return inventoryID;
    }
    public String toString() {
        return("Дуршлак: Название: '" + this.name + "', Цена: "
                + this.cost + "руб." + ", Инвентарный номер: " + this.inventoryID);
    }
}
