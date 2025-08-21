package com.gqt.corejava.statics;
class CompoundInterestUtil {
    public static double compoundInterest(double p, double r, double t) {
        return p * Math.pow((1 + r / 100), t) - p;
    }
}

public class CompoundInterest {
    public static void main(String[] args) {
        System.out.println("Compound Interest = " + CompoundInterestUtil.compoundInterest(2000, 5, 2));
    }
}
