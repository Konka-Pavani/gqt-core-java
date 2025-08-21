package com.gqt.corejava.statics;
class Counter {
    static int count = 0;

    Counter() { count++; }

    public static int getCount() { return count; }
}

public class ObjectCounter {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();

        System.out.println("Number of objects created: " + Counter.getCount());
    }
}
