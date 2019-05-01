package com.company;

public class BookApp {
    public static void main(String[] args){
        Book book1 = new Book("Java Programming","An Author","A book about Java programming",20.00,true);
        book1.getDisplayText();
        book1.requestBooks(5);
        System.out.println();
        Book book2 = new Book("Intro to Java Programming","An Author","A book about intro Java programming",59.99,false);
        book2.getDisplayText();
        book2.requestBooks(5);
    }
}
