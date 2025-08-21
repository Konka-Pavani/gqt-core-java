package com.gqt.corejava.statics;
class FibonacciUtil {
    public static int fib(int n) {
        if(n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }
}

public class FibonacciDemo {
    public static void main(String[] args) {
        System.out.print("Fibonacci series: ");
        for(int i=0; i<10; i++) {
            System.out.print(FibonacciUtil.fib(i) + " ");
        }
    }
}
