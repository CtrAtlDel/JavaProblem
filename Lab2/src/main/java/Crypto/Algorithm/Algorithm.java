package Crypto.Algorithm;

import Crypto.Const.Const;
import Crypto.Sha.ShaXX;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Algorithm {
    public static void AlgorithmHB(int size, byte[] firstArray) throws Exception {
        if (size < Const.MinSha || size > Const.MaxSha) throw new Exception("Size < 0 or Size > 20");
        var shaXX = new ShaXX(size);

        var map = new HashMap<byte[],byte[]>();
        map.put(firstArray, shaXX.getHash(firstArray));

        while(true){
            var x = byteGenerator(size + 1); // generate random byte array with size
            var hashX = shaXX.getHash(x);

            if (!map.containsKey(x)){
                if (map.containsValue(hashX)){

                }
            }

        }

    }

    private boolean isEqual(byte[] first, byte[] last){
        return Arrays.equals(first,last);
    }

    public static byte[] byteGenerator(int size) throws Exception{
        if (size <= 0) throw new Exception("Size < 0");
        var byteArray = new byte[size];
        new Random().nextBytes(byteArray);
        return byteArray;
    }
}

