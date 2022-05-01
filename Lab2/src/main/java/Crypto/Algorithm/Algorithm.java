package Crypto.Algorithm;

import Crypto.Const.Const;
import Crypto.Sha.ShaXX;

import java.nio.ByteBuffer;
import java.util.*;

public class Algorithm {
    public static void AlgorithmHB(int size, byte[] firstArray) throws Exception {
        if (size < Const.MinSha || size > Const.MaxSha) throw new Exception("Size < 0 or Size > 20");

        var shaXX = new ShaXX(size);
        Comparator<byte[]> pcomp = new fixedComparator();
        var map = new TreeMap<byte[], byte[]>(pcomp);
        int counterCollision = 0;
        var hashArray = shaXX.getHash(firstArray);
        System.out.println("X-> " + firstArray + " hashX-> " + hashArray);
        map.put(firstArray, shaXX.getHash(firstArray));

        while (true) {
            var x = byteGenerator(size + 5); // generate random byte array with size
            var hashX = shaXX.getHash(x);

            if (!map.containsKey(x) ){
                if (!map.containsValue(hashX)) {
                    map.put(x, hashX);
                } else {
                    counterCollision++;
                    System.out.println("Collision:" + ByteBuffer.wrap(hashX).getInt() + " X: " + ByteBuffer.wrap(x).getInt());
                }
            }
        }

    }

    private boolean isEqual(byte[] first, byte[] last) {
        return Arrays.equals(first, last);
    }

    public static byte[] byteGenerator(int size) throws Exception {
        if (size <= 0) throw new Exception("Size < 0");

        var byteArray = new byte[size];
        new Random().nextBytes(byteArray);
        return byteArray;
    }

    record Pair(byte[] first, byte[] last) {
    }
}

