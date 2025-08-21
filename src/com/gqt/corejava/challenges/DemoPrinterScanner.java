package com.gqt.corejava.challenges;
interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class Printer implements Printable {
    public void print() { System.out.println("Printing document..."); }
}

class ScannerDevice implements Scannable {
    public void scan() { System.out.println("Scanning document..."); }
}

public class DemoPrinterScanner {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();

        ScannerDevice scanner = new ScannerDevice();
        scanner.scan();
    }
}
