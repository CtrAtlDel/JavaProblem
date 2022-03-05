package byEpam;

public class Main {
    public static void main(String[] args) {
        Thread talk = new Thread(new TalkThread());
        talk.start();

    }

}
