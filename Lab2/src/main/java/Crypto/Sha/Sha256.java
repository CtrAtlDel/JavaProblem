package Crypto.Sha;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class Sha256 {
    protected static byte[] getShaByString(String original) throws NoSuchAlgorithmException { // string -> byte
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        return digest.digest(original.getBytes());
    }

    protected static String getShaByByte(String original) throws NoSuchAlgorithmException {
        return byteToString(getShaByString(original));
    }

    protected static String byteToString(byte[] hash) {
        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1)
                hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }

}
