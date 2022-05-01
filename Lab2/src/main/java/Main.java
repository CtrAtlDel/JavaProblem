import Crypto.Algorithm.Algorithm;
import Crypto.Algorithm.fixedComparator;
import Crypto.Sha.ShaXX;

import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws Exception {
        int size = 15;
        Algorithm.AlgorithmHB(size, Algorithm.byteGenerator(size));
        Comparator<byte[]> pcomp = new fixedComparator();
        int[] first = {1, 2, 3, 4};

        int[] second = {1, 2, 3, 4};

        var mapp = new HashMap<>();
        mapp.put(1, first);
        var bool = mapp.containsValue(second);
        System.out.println(mapp.containsValue(second));
    }

}
