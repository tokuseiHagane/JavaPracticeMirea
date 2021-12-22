package ru.mirea.task13;

import java.util.Arrays;
import java.util.*;

public class ArrayListCheck {

    public static void main(String[] args) {
        //инициализация массива
        ArrayList <String> deliveryCities = new ArrayList<>();

        deliveryCities.add("Gun's & Roses");
        deliveryCities.add("My Chemical Romance");
        deliveryCities.add("Powerwolf");
        deliveryCities.add("Bullet For My Valentine");

        //вывод размера массива
        System.out.println(deliveryCities.size());
        //вывод массива
        System.out.print(deliveryCities + " ");
        System.out.println();
        //добавление нового элемента
        deliveryCities.add(4, "Disurbed");
        System.out.print(deliveryCities + " ");
        System.out.println();
        //вывод конкретного элемента
        System.out.println(deliveryCities.get(2));
        //вывод индекса элементов
        System.out.print(deliveryCities.indexOf("Gun's & Roses") + " ");
        System.out.print(deliveryCities.indexOf("Bullet For My Valentine"));
        System.out.println();
        //замена элемента
        deliveryCities.set(2, "Sabaton");
        System.out.print(deliveryCities + " ");
        System.out.println();
        //удаление объекта
        deliveryCities.remove(3);
        System.out.print(deliveryCities + " ");
        System.out.println();
    }
}
