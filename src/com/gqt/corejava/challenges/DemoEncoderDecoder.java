package com.gqt.corejava.challenges;
interface Encryptable {
    void encrypt(String data);
}

interface Decryptable {
    void decrypt(String data);
}

class Encoder implements Encryptable {
    public void encrypt(String data) { System.out.println("Encrypted: " + new StringBuilder(data).reverse()); }
}

class Decoder implements Decryptable {
    public void decrypt(String data) { System.out.println("Decrypted: " + new StringBuilder(data).reverse()); }
}

public class DemoEncoderDecoder {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        encoder.encrypt("Hello");

        Decoder decoder = new Decoder();
        decoder.decrypt("olleH");
    }
}
