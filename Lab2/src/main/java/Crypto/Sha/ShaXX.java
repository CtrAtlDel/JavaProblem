package Crypto.Sha;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public final class ShaXX extends Sha256 {
    public static byte[] getShaByString(String original, int size) throws Exception {
        if (size < 15 || size > 20)
            throw new Exception("Size < 0 or Size > 20");

        var result = getShaByString(original);

        return Arrays.copyOfRange(result, 0, size);
    }

    public static @NotNull String getShaByByte(String original, int size) throws Exception {
        if (size < 15 || size > 20)
            throw new Exception("Size < 0 or Size > 20");

        return byteToString(getShaByString(original, size));
    }

}
