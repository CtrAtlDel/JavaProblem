package prototype;

public class Test implements ProjectItem {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }; 
}
