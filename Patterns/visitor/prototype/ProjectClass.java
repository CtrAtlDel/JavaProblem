package prototype;

public class ProjectClass implements ProjectItem  {

    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    };
    
}
