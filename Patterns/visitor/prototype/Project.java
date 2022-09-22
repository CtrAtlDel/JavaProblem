package prototype;

public class Project implements ProjectItem {
    private ProjectItem[] projectItems;

    public Project() {
        this.projectItems = new ProjectItem[] {
            new ProjectClass(),
            new Database(),
            new Test()
        };
    }
    
    @Override
    public void beWritten(Developer developer) {
        for (ProjectItem projectItem : projectItems) {
            projectItem.beWritten(developer);
        }
    }
    
}
