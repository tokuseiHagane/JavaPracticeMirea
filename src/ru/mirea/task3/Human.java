package ru.mirea.task3;

public class Human {
    public Head head;
    public Leg rightLeg;
    public Hand rightHand;
    public Leg leftLeg;
    public Hand leftHand;

    Human(String skinColor, String hairColor, int footSize,
                 String facialFeatures, boolean tatooLeft, boolean tatooRight)
    {
        head = new Head(hairColor, skinColor, facialFeatures);
        leftHand = new Hand("Левая", skinColor, tatooLeft);
        rightHand = new Hand("Правая", skinColor, tatooRight);
        leftLeg = new Leg("Левая", footSize, skinColor);
        rightLeg = new Leg("Правая", footSize, skinColor);
    }
    public void getHumanInfo() {
        head.getHeadInfo();
        leftHand.getHandInfo();
        rightHand.getHandInfo();
        leftLeg.getLegInfo();
        rightLeg.getLegInfo();
    }
}
