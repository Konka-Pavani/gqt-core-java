package com.gqt.corejava.statics;
class TriangleUtil {
    public static double area(double base, double height) {
        return 0.5 * base * height;
    }
}

public class TriangleArea {
    public static void main(String[] args) {
        System.out.println("Area of triangle = " + TriangleUtil.area(10, 5));
    }
}
