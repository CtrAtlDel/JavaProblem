package prototype;

public class Programm {
    public static void main(String[] args) {
        Project project = new Project();
        Developer junior = new Junior();
        Developer senior = new Senior();
        
        project.beWritten(junior);
        System.out.println("\n===========================\n");
        project.beWritten(senior);

    }
}