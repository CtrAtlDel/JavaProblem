import java.util.Objects;

public class Programm {
    public static void main(String[] args) {
        var first = Singleton.getInstance();
        var second = Singleton.getInstance();
        System.out.println("Eq1uals " + Objects.equals(first, second));
    }
}