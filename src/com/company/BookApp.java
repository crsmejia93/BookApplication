package com.company;

public class BookApp {
    public static void main(String[] args){
        Book book1 =
                new Book("Java Programming","An Author","A book about Java programming",59.99,true);
        book1.getDisplayText();
    }
}
