package com.gqt.corejava.encapsulation;
class MobilePhone {
    private String brand;
    private String model;
    private double price;

    public String getBrand() { 
    	return brand; 
    	}
    public void setBrand(String brand) {
    	this.brand = brand; 
    	}
    public String getModel() {
    	return model;
    	}
    public void setModel(String model) { 
    	this.model = model; 
    	}
    public double getPrice() {
    	return price; 
    	}
    public void setPrice(double price) { 
    	this.price = price; 
    	}
}

public class MobilePhoneDemo {
    public static void main(String[] args) {
        MobilePhone mp = new MobilePhone();
        mp.setBrand("Samsung");
        mp.setModel("S24 Ultra");
        mp.setPrice(1200);

        System.out.println("Mobile Phone: " + mp.getBrand() + " " + mp.getModel() + " " + mp.getPrice());
    }
}
