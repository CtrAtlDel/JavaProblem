package WithVolitile;

public class Programm {
    Singleton first = Singleton.getInstance();
    Singleton second = Singleton.getInstance();
    System.out.println("Equals " + Objects.equals(first, second));
}
