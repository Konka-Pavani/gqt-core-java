package com.gqt.corejava.encapsulation;
class Computer {
    private String brand;
    private String model;
    private double price;

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}

public class ComputerDemo {
    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.setBrand("Dell");
        comp.setModel("XPS 15");
        comp.setPrice(1800);

        System.out.println("Computer: " + comp.getBrand() + " " + comp.getModel() + " " + comp.getPrice());
    }
}
