package Crypto.Sha;

import Crypto.Const.Const;

import java.util.Arrays;

public final class ShaXX extends Sha256 {
    public static byte[] getShaByString(String original, int size) throws Exception {
        if (size < Const.MinSha || size > Const.MaxSha) throw new Exception("Size < 0 or Size > 20");

        var result = getShaByString(original);

        return Arrays.copyOfRange(result, 0, size);
    }

    public static String getShaByByte(String original, int size) throws Exception {
        if (size < Const.MinSha || size > Const.MaxSha) throw new Exception("Size < 0 or Size > 20");

        return byteToString(getShaByString(original, size));
    }

}
