package com.gqt.corejava.challenges;
interface Drawable {
    void draw();
}

interface Erasable {
    void erase();
}

class Whiteboard implements Drawable, Erasable {
    public void draw() { System.out.println("Drawing on Whiteboard"); }
    public void erase() { System.out.println("Erasing Whiteboard"); }
}

class Chalkboard implements Drawable, Erasable {
    public void draw() { System.out.println("Drawing on Chalkboard"); }
    public void erase() { System.out.println("Erasing Chalkboard"); }
}

public class DemoBoards {
    public static void main(String[] args) {
        Whiteboard wb = new Whiteboard();
        wb.draw();
        wb.erase();

        Chalkboard cb = new Chalkboard();
        cb.draw();
        cb.erase();
    }
}
