package com.gqt.corejava.statics;
class RectangleUtil {
    public static double area(double l, double w) {
        return l * w;
    }
}

public class RectangleArea {
    public static void main(String[] args) {
        System.out.println("Area of rectangle = " + RectangleUtil.area(10, 5));
    }
}
