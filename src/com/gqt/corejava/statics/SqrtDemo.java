package com.gqt.corejava.statics;
class SqrtUtil {
    public static double sqrt(double n) {
        return Math.sqrt(n);
    }
}

public class SqrtDemo {
    public static void main(String[] args) {
        System.out.println("√25 = " + SqrtUtil.sqrt(25));
    }
}
