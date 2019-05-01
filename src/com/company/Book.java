package com.company;

public class Book {
    private String title;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;

    public String getTitle() {
        return title;
    }

    public Book(){
        this.title="";
        this.author="";
        this.description="";
        this.price = 0.0f;
        this.isInStock=false;
    }

    public Book(double price){
        this.price = price;
    }

    public Book(String title, String author, String description, double price, boolean isInStock){
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String isInStock() {
        String str;
        if(this.isInStock){
            str = "Yes";
        }else{
            str= "No";
        }
        return str;
    }

    public void requestBooks(int quantity){
        double total=0;
        //if the book is in stock
        if(this.isInStock().equalsIgnoreCase("yes")) {
            //calculate the total for the quantity of books specified
            //depending on the price of the book
            for (int i = 0; i < quantity; i++) {
                total+=this.getPrice();
            }
        }
        System.out.printf("$%,.2f for %d books.\n", total, quantity);
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public void getDisplayText(){
        System.out.printf("Book Title: %s\nAuthor: %s\n" +
                        "Description: %s\nPrice: %,.2f\nIn Stock: %s\n\n",
                        getTitle(),getAuthor(),getDescription(),getPrice(),isInStock());
    }
}
