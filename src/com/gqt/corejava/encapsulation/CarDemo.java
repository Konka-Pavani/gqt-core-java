package com.gqt.corejava.encapsulation;
class Car {
    private String model;
    private String color;
    private double price;

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}

public class CarDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.setModel("Tesla Model S");
        c.setColor("Red");
        c.setPrice(75000);

        System.out.println("Car: " + c.getModel() + " " + c.getColor() + " " + c.getPrice());
    }
}
