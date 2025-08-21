package com.gqt.corejava.statics;
class RhombusUtil {
    public static double area(double d1, double d2) {
        return 0.5 * d1 * d2;
    }
}

public class RhombusArea {
    public static void main(String[] args) {
        System.out.println("Area of rhombus = " + RhombusUtil.area(8, 6));
    }
}
