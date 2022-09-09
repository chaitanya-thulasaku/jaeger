package com.irecruit.form.service;
//encryption decryption using secret key cipher
public interface EncryptionService {
     String encrypt(String data);
     String decrypt(String data);
}
