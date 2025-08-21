package com.gqt.corejava.statics;
class CylinderUtil {
    public static double volume(double r, double h) {
        return Math.PI * r * r * h;
    }
}

public class CylinderVolume {
    public static void main(String[] args) {
        System.out.println("Volume of cylinder = " + CylinderUtil.volume(3, 10));
    }
}
