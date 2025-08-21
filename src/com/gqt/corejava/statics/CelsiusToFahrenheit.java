package com.gqt.corejava.statics;
class TempConverter {
    public static double toFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
}

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        System.out.println("25°C = " + TempConverter.toFahrenheit(25) + "°F");
    }
}
