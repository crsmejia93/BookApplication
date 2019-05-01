package com.company;

public class BookApp {
    public static void main(String[] args){
        Book book1 =
                new Book("Java Programming","An Author","A book about Java programming",20.00,true);
        book1.getDisplayText();
        Book book2 =
                new Book("Intro to Java Programming","An Author","A book about intro Java programming",59.99,true);
        book2.getDisplayText();

        book1.requestBooks(5);
    }
}
