package ru.mirea.task3;

public class Head {
    protected String hairColor;
    protected String skinColor;
    protected String facialFeatures;

    Head(String hairColor, String skinColor, String facialFeatures){
        this.hairColor = hairColor;
        this.skinColor = skinColor;
        this.facialFeatures = facialFeatures;
    }

    void getHeadInfo() {
        System.out.println("Голова: цвет волос - "+this.hairColor+
                ", цвет кожи - "+this.skinColor+", черты лица - "+this.facialFeatures);
    }
}
