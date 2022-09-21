package MultiThreadingWithExceptions;

import java.util.Objects;

public class Programm {
    public static void main(String[] args) {
        Singleton first = Singleton.getInstance();
        Singleton second = Singleton.getInstance();
        System.out.println("Equals " + Objects.equals(first, second));
    }
}