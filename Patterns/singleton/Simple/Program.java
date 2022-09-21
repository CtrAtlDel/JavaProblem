import java.util.Objects;

public class Program {
    public static void main(String[] args) {
        Singleton first = Singleton.getInstance();
        Singleton second = Singleton.getInstance();

        System.out.println("Check that its tru" + Objects.equals(first, second));
    }
}
