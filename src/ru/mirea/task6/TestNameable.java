package ru.mirea.task6;

public class TestNameable {
    public static void main(String[] args) {
        Nameable n1 = new CarPrint("Рухлять Михалыча");
        Nameable n2 = new CarPrint();
        System.out.println(n1.getName());
        System.out.println(n2.getName());
        n1 = new HumanPrint("Михалыч");
        n2 = new HumanPrint();
        System.out.println(n1.getName());
        System.out.println(n2.getName());
    }
}
