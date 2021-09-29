package ru.mirea.task5;

public class FurnitureShop {
    public static void main(String[] args) {
        Stool s1 = new Stool("Табурет", "Дерево", 210, 1500);
        Stool s2 = new Stool("Табурет", "Сталь", 120, 2300);
        Table t1 = new Table("Cтол", "Кедр", 23, 9500);
        Table t2 = new Table("Cтол", "Пластик", 320, 2000);
        Cupboard c1 = new Cupboard("Шкафчик", "Дуб", 97, 6500);
        Cupboard c2 = new Cupboard("Шкафчик", "ДСП", 120, 2300);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(c1);
        System.out.println(c2);
    }
}
