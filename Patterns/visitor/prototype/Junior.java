package prototype;

public class Junior implements Developer {

    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Bad creating...");
        
    }

    @Override
    public void create(Database database) {
        System.out.println("Drop database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Negative test...");
        
    }
    
}
