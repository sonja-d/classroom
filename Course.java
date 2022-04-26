public class Course {
    private String name;
    private int numberOfClasses;
    private String codeName;

    public Course() {
    }

    public Course(String name, int numberOfClasses, String codeName) {
        this.setName(name);
        this.setNumberOfClasses(numberOfClasses);
        this.setCodeName(codeName);
    }
    public void setName(String courseName) {
      this.name = courseName;
    }
    public String getName() {
        return this.name;
    }
    public void setNumberOfClasses(int numberOfClasses) {
      this.numberOfClasses = numberOfClasses;
    }

    public int getNumberOfClasses() {
        return this.numberOfClasses;
    }
    public void setCodeName(String codeName) {
      this.codeName = codeName;
    }
    
    public String getCodeName() {
        return this.codeName;
    }

    public void printInConsole() {
        System.out.println("Name of Course: " + this.getName());
        System.out.println("Number of classes: " + this.getNumberOfClasses());
        System.out.println("Code name: " + this.getCodeName());
    }

}
