package com.gqt.corejava.statics;
class PolygonUtil {
    public static double area(int n, double side) {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }
}

public class PolygonArea {
    public static void main(String[] args) {
        System.out.println("Area of hexagon (side=6) = " + PolygonUtil.area(6, 6));
    }
}
