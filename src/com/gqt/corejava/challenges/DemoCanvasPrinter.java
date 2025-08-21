package com.gqt.corejava.challenges;
interface Drawable {
    void draw();
}

interface Printable {
    void print();
}

class Canvas implements Drawable {
    public void draw() { System.out.println("Drawing on Canvas..."); }
}

class Printer implements Printable {
    public void print() { System.out.println("Printing on Paper..."); }
}
public class DemoCanvasPrinter {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.draw();

        Printer printer = new Printer();
        printer.print();
    }
}
