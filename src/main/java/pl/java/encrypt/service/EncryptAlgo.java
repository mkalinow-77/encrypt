package pl.java.encrypt.service;

public interface EncryptAlgo {

    String encrypt(String source);

    String key();

    String description();
}
