package com.gqt.corejava.statics;
class TempConverter1 {
    public static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        System.out.println("77°F = " + TempConverter1.toCelsius(77) + "°C");
    }
}
