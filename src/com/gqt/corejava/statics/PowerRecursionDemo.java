package com.gqt.corejava.statics;
class PowerRecursion {
    public static int power(int base, int exp) {
        if(exp == 0) return 1;
        return base * power(base, exp - 1);
    }
}

public class PowerRecursionDemo {
    public static void main(String[] args) {
        System.out.println("2^5 = " + PowerRecursion.power(2, 5));
    }
}
