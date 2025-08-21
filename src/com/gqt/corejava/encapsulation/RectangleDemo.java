package com.gqt.corejava.encapsulation;
class Rectangle {
    private double length;
    private double width;
    private double area;

    public double getLength() { return length; }
    public void setLength(double length) { 
        this.length = length; 
        calculateArea();
    }
    public double getWidth() { return width; }
    public void setWidth(double width) { 
        this.width = width; 
        calculateArea();
    }
    public double getArea() { return area; }

    private void calculateArea() {
        this.area = length * width;
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(10);
        r.setWidth(5);

        System.out.println("Rectangle: Length=" + r.getLength() + " Width=" + r.getWidth() + " Area=" + r.getArea());
    }
}
