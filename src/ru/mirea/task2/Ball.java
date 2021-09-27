package ru.mirea.task2;

import java.lang.*;
public class Ball {
    private String mainteiner;
    private String usage;
    private int cost;
    private int since_buy; //years

    public Ball(String m, String u, int c, int sb) {
        mainteiner = m;
        usage = u;
        cost = c;
        since_buy = sb;
    }

    public Ball(String m, String u, int c) {
        mainteiner = m;
        usage = u;
        cost = c;
        since_buy = 4;
    }

    public Ball(String m, String u) {
        mainteiner = m;
        usage = u;
        cost = 300;
        since_buy = 2;
    }

    public Ball(String m) {
        mainteiner = m;
        usage = "basketball";
        cost = 400;
        since_buy = 1;
    }

    public Ball() {
        mainteiner = "China";
        usage = "soccer";
        cost = 200;
        since_buy = 5;
    }

    public void setMainteiner(String mainteiner) {
        this.mainteiner = mainteiner;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setSinceBuy(int since_buy) {
        this.since_buy = since_buy;
    }

    public String getMainteiner() {
        return mainteiner;
    }

    public String getUsage() {
        return usage;
    }

    public int getCost() {
        return cost;
    }

    public int getSinceBuy() {
        return since_buy;
    }

    public String toString() {
        return "Mainteiner: " + this.mainteiner + ", usage: " + this.usage +
                ", cost: " + this.cost + ", since buy:" + this.since_buy;
    }

    public void calcCurrentCost() {
        System.out.println("Current cost is " + (cost - since_buy*200));
    }
}
