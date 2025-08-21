package com.gqt.corejava.statics;
class ParallelogramUtil {
    public static double area(double base, double height) {
        return base * height;
    }
}

public class ParallelogramArea {
    public static void main(String[] args) {
        System.out.println("Area of parallelogram = " + ParallelogramUtil.area(12, 5));
    }
}
