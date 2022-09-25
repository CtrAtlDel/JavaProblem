public class Program {
    public static void main(String[] args) {
        while (true) {
            try {
                Thread.sleep(500);
                System.out.println("I am running...");
            } catch (InterruptedException ex) {
                System.out.println("Something went wrong...");
            }
        }
    }
}
