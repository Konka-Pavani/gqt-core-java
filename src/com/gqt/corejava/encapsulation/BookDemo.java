package com.gqt.corejava.encapsulation;
class Book {
    private String title;
    private String author;
    private double price;

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}

public class BookDemo {
    public static void main(String[] args) {
        Book b = new Book();
        b.setTitle("Java Programming");
        b.setAuthor("James Gosling");
        b.setPrice(450.5);

        System.out.println("Book: " + b.getTitle() + " by " + b.getAuthor() + " Price=" + b.getPrice());
    }
}
