package com.gqt.corejava.encapsulation;
class LibraryBook {
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

public class LibraryBookDemo {
    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook();
        lb.setTitle("Data Structures");
        lb.setAuthor("Mark Allen Weiss");
        lb.setPrice(999.99);

        System.out.println("Library Book: " + lb.getTitle() + " by " + lb.getAuthor() + " Price=" + lb.getPrice());
    }
}
