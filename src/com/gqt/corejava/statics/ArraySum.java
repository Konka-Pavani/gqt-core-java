package com.gqt.corejava.statics;
class ArrayUtil {
    public static int sum(int[] arr) {
        int s = 0;
        for(int n : arr) s += n;
        return s;
    }
}

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Sum = " + ArrayUtil.sum(arr));
    }
}
