package prototype;

public class Senior implements Developer{

    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Senior creating...");
        
    }

    @Override
    public void create(Database database) {
        System.out.println("Create database...");
        
    }

    @Override
    public void create(Test test) {
        System.out.println("Positive test...");
        
    }
    
}
