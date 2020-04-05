package com.company;

public class PostOfficeTest {

    public static void main(String[] args) {

        PostOffice DHL = new PostOffice();

        DHL.setAddress("Проспект Соборный");
        DHL.setCity("Запорожье");
        DHL.isInternational = true;
        DHL.setNumberOrders(10000);
        DHL.setNumberVisitors(1000);

        System.out.println("Адрес - " + DHL.getAddress());
        System.out.println("Местонахождение - " + DHL.getCity());
        System.out.println("Осуществляет ли международные перевозки - " + DHL.isInternational);
        System.out.println("Количество заказов в день - " + DHL.getNumberOrders() + " штук");
        System.out.println("Количество посетителей в день - " + DHL.getNumberVisitors() + " человек");
    }
}
