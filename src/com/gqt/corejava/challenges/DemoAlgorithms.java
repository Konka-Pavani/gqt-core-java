package com.gqt.corejava.challenges;
class EncryptionAlgorithm implements Encryptable {
    public void encrypt(String data) { System.out.println("Algorithm Encrypted: " + data.toUpperCase()); }
}

class DecryptionAlgorithm implements Decryptable {
    public void decrypt(String data) { System.out.println("Algorithm Decrypted: " + data.toLowerCase()); }
}

public class DemoAlgorithms {
    public static void main(String[] args) {
        EncryptionAlgorithm enc = new EncryptionAlgorithm();
        enc.encrypt("hello");

        DecryptionAlgorithm dec = new DecryptionAlgorithm();
        dec.decrypt("HELLO");
    }
}
