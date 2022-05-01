package Crypto.Algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class fixedComparator implements Comparator<byte[]> {
    @Override
    public int compare(byte[] o1, byte[] o2) {
        if (Arrays.equals(o1,o2))
            return 1;

        return 0;
    }

}
