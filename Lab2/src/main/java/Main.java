import Crypto.Sha.ShaXX;

import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start Lab2");
        String str = "StartLab2heheheheh";
        String str2 = "Start";
        String hashStr = null;
        String hashStr2 = null;
        byte[] hashBytes = null;
        byte[] hashBytes2 = null;
        int size = 15;
        try {
            hashStr = ShaXX.getShaByByte(str, size);
            hashStr2 = ShaXX.getShaByByte(str2, size);
            hashBytes = ShaXX.getShaByString(str, size);
            hashBytes2 = ShaXX.getShaByString(hashStr2, size);

        } catch (NoSuchAlgorithmException e) {
            System.err.println("I'm sorry, but SHA-256 is not a valid message digest algorithm");
        } catch (Exception e) {
            e.printStackTrace();
        }
//        for (byte hashByte : hashBytes) {
//            System.out.print(hashByte);
//        }
//        System.out.println();
//        System.out.println(hashStr);
//
//        for (byte b : hashBytes2) {
//            System.out.print(b);
//        }
//        System.out.println();
//        System.out.println(hashStr2);
    }
}
