package com.gqt.corejava.statics;
class StringUtil {
    public static String reverse(String str) {
        if(str.isEmpty()) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
}

public class ReverseString {
    public static void main(String[] args) {
        String s = "HELLO";
        System.out.println("Reverse of " + s + " = " + StringUtil.reverse(s));
    }
}
