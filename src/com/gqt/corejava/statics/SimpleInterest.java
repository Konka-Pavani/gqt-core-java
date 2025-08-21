package com.gqt.corejava.statics;
class InterestUtil {
    public static double simpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }
}

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Simple Interest = " + InterestUtil.simpleInterest(1000, 5, 2));
    }
}
