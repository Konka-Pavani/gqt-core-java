package com.gqt.corejava.encapsulation;
class Circle {
    private double radius;
    private double area;
    private double circumference;

    public double getRadius() { return radius; }
    public void setRadius(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
        this.circumference = 2 * Math.PI * radius;
    }
    public double getArea() { return area; }
    public double getCircumference() { return circumference; }
}

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(7);

        System.out.println("Circle: Radius=" + circle.getRadius() + " Area=" + circle.getArea() + " Circumference=" + circle.getCircumference());
    }
}
