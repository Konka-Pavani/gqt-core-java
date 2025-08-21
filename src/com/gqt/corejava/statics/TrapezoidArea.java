package com.gqt.corejava.statics;
class TrapezoidUtil {
    public static double area(double a, double b, double h) {
        return 0.5 * (a + b) * h;
    }
}

public class TrapezoidArea {
    public static void main(String[] args) {
        System.out.println("Area of trapezoid = " + TrapezoidUtil.area(10, 6, 5));
    }
}
