public class Student{
  private String firstName;
  private String lastName;
  private int yearOfBirth;

  public Student(){
  }

  public Student(String firstName, String lastName, int yearOfBirth){
    this.setName(firstName);
    this.setLastName(lastName);
    this.setYear(yearOfBirth);
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
    System.out.println();
  }
}