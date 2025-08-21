package com.gqt.corejava.challenges;
interface Writable {
    void write(String data);
}

interface Readable {
    void read();
}

class TextFile implements Writable, Readable {
    String content = "";
    public void write(String data) { content = data; System.out.println("Written to file: " + data); }
    public void read() { System.out.println("Reading file: " + content); }
}

class DatabaseTable implements Writable, Readable {
    String record = "";
    public void write(String data) { record = data; System.out.println("Inserted record: " + data); }
    public void read() { System.out.println("Reading record: " + record); }
}

public class DemoWritableReadable {
    public static void main(String[] args) {
        TextFile tf = new TextFile();
        tf.write("Hello.txt");
        tf.read();

        DatabaseTable db = new DatabaseTable();
        db.write("Row1 Data");
        db.read();
    }
}
