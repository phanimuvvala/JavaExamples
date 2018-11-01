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
public class DecryptionUtility {

    private final static String ALGORITHM = "DES";

    public static String decryptData(String secretKey, String data) throws Exception {
        if (secretKey == null || secretKey.length() != 8)
                throw new Exception("Invalid key length - 8 bytes key needed!");

        SecretKey key = new SecretKeySpec(secretKey.getBytes(), ALGORITHM);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, key);

        return new String(cipher.doFinal(convertByteArray(data)));
    }

    private static byte[] convertByteArray(String hexString) {
        int len = hexString.length()/2;
        byte[] result = new byte[len];
        for (int i = 0; i < len; i++)
        	result[i] = Integer.valueOf(hexString.substring(2*i, 2*i+2), 16).byteValue();
        return result;
    }
}
