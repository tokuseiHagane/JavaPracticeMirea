package ru.mirea.task3;

public class Hand {
    protected boolean tatoo;
    protected String skinColor;
    protected String whichHand;

    Hand(String whichHand, String skinColor, boolean tatoo){
        this.whichHand = whichHand;
        this.skinColor = skinColor;
        this.tatoo = tatoo;
    }
    void getHandInfo() {
        System.out.print(this.whichHand+" рука: "+
                "цвет кожи - "+this.skinColor+", татуировки - ");
        if(tatoo) System.out.println("есть");
        else System.out.println("нет");
    }
}
