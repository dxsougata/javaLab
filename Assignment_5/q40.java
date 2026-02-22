class Project {
    String projectName;
    
    Project(String projectName) {
        this.projectName = projectName;
    }
    
    void display() {
        System.out.println("Project: " + projectName);
    }
}

class Developer {
    String name;
    Project project; 
    
    Developer(String name) {
        this.name = name;
    }
    
    void assignProject(Project project) {
        this.project = project;
    }
    
    void display() {
        System.out.println("Developer: " + name);
        if (project != null) {
            project.display();
        }
    }
}

public class q40 {
    public static void main(String[] args) {
        Project p = new Project("Web Development");
        Developer d1 = new Developer("Alice");
        Developer d2 = new Developer("Bob");
        
        d1.assignProject(p);
        d1.display();
        d2.display(); 
        
        System.out.println("Sougata Kundu,24155737");
    }
}
