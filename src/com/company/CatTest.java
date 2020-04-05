package com.company;

public class CatTest {

    public static void main(String[] args) {

        Cat Tosha = new Cat();
        System.out.println("Настроение весь день - " + Tosha.allDayMood + ".");
        Tosha.name = "Тоша";
        Tosha.age = 7;
        Tosha.breed = "Ирландец";
        Tosha.color = "Рыжий";
        Tosha.isBoy = true;

        System.out.println("Имя - " + Tosha.name);
        System.out.println("Возраст - " + Tosha.age);
        System.out.println("Порода - " + Tosha.breed);
        System.out.println("Цвет - " + Tosha.color);
        System.out.println("Это мальчик - " + Tosha.isBoy);

    }
}
