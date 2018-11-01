/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.encryptanddecrypt.samples;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author PHANI
 */
public class EncryptionUtility {

    private final static String ALGORITHM = "DES"; // Algoritham Name
    private final static String HEX = "0123456789ABCDEF";

    public static String encryptData(String secretKey, String data) throws Exception {
        if (secretKey == null || secretKey.length() != 8)
                throw new Exception("Invalid key length - 8 bytes key needed!");

        SecretKey key = new SecretKeySpec(secretKey.getBytes(), ALGORITHM);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, key);

        return convertHexaData(cipher.doFinal(data.getBytes()));
    }
    public static String convertHexaData(byte[] stringBytes) {
        StringBuffer result = new StringBuffer(2*stringBytes.length);

        for (int i = 0; i < stringBytes.length; i++) {
            result.append(HEX.charAt((stringBytes[i]>>4)&0x0f)).append(HEX.charAt(stringBytes[i]&0x0f));
        }

        return result.toString();
    }


}
