package com.company;

public class Main {

    public static void main(String[] args) {

        Book TheGreatGatsby = new Book();

        TheGreatGatsby.BookName = "The Great Gatsby";
        TheGreatGatsby.Author = "F.Scott Fitzgerald";
        TheGreatGatsby.PublishedYear = "1925";
        TheGreatGatsby.SheetNumber = 174;

        System.out.println( "Название книги - " + TheGreatGatsby.BookName);
        System.out.println("Автор - " + TheGreatGatsby.Author);
        System.out.println("Год издательства - " + TheGreatGatsby.PublishedYear + "г.");
        System.out.println("Количество страниц - " + TheGreatGatsby.SheetNumber + " стр.");
        System.out.println("Стоимость книги - 100 " + TheGreatGatsby.currency + ".");

    }
}

