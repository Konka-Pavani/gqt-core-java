package com.gqt.corejava.statics;
class SquareUtil {
    public static double area(double side) {
        return side * side;
    }
}

public class SquareArea {
    public static void main(String[] args) {
        System.out.println("Area of square = " + SquareUtil.area(6));
    }
}
