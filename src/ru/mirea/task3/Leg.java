package ru.mirea.task3;

public class Leg {
    protected String skinColor;
    protected int footSize;
    protected String whichLeg;

    Leg(String whichLeg, int footSize, String skinColor){
        this.whichLeg = whichLeg;
        this.skinColor = skinColor;
        this.footSize = footSize;
    }
    void getLegInfo() {
        System.out.println(this.whichLeg+" нога: "+
                "цвет кожи - "+this.skinColor+", размер ступни - "+this.footSize);
    }
}
