package prototype;

public class Database implements ProjectItem {

    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
