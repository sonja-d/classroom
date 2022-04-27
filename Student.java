public class Student{
  private String firstName;
  private String lastName;
  private int yearOfBirth;
  private Course course;
  private Computer computer;


  public Student(){
  }

  public Student(String firstName, String lastName, int yearOfBirth) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.yearOfBirth = yearOfBirth;
  }

  public Student(String firstName, String lastName, int yearOfBirth, Course course, Computer computer) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.yearOfBirth = yearOfBirth;
    this.course = course;
    this.computer = computer;
  }

  public void setCourse(Course course){
    this.course = course;
  }

  public Course getCourse(){
    return this.course;
  }

  public void setComputer(Computer computer) {
    this.computer = computer;
  }

  public Computer getComputer() {
    return this.computer;
  }

  public void setName(String studentName){
    this.firstName = studentName;
  }

  public String getName(){
    return this.firstName;
  }

  public void setLastName(String studentLastName){
    this.lastName = studentLastName;
  }

  public String getLastName(){
    return this.lastName;
  }
 
  public void setYear(int studentYearOfBirth){
    this.yearOfBirth = studentYearOfBirth;
  }

  public int getYear(){
    return this.yearOfBirth;
  }

  public void printInConsole(){
    System.out.println("First name: " + this.getName());
    System.out.println("Last name: " + this.getLastName());
    System.out.println("Year of birth: " + this.getYear());
    if (this.getCourse() == null) {
      System.out.println("Course not defined");
    } else {
      this.getCourse().printInConsole();
    }
    if (this.getComputer() == null) {
      System.out.println("Computer not defined");
    } else {
      this.getComputer().printInConsole();
    }
    System.out.println();
    
  }
}