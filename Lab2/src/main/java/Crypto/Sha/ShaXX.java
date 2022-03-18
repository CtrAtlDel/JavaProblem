package Crypto.Sha;

import Crypto.Const.Const;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public final class ShaXX {

    private int size = 0; //default value

    public ShaXX(int size) throws Exception {
        if (size < Const.MinSha || size > Const.MaxSha) throw new Exception("Size < 0 or Size > 20");
        this.size = size;
    }

    public byte[] getHash(byte[] array) throws NoSuchAlgorithmException {
        var digest = MessageDigest.getInstance("SHA-256");
        var result = digest.digest(array);
        return Arrays.copyOfRange(result, 0, size);
    }

}
