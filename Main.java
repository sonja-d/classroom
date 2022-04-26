public class Main {
  public static void main(String[] args) {
    System.out.println("Classroom details: ");
    System.out.println();
    
    Course coursePhp = new Course();
    coursePhp.setName("PHP");
    coursePhp.setNumberOfClasses(2);
    coursePhp.setCodeName("PHP-33");
    coursePhp.printInConsole();
    System.out.println();

    Course courseJava = new Course("Java", 5, "Java-33");
    courseJava.printInConsole();
    System.out.println();
  
    Computer apple = new Computer();
    apple.setComputerName("Apple");
    apple.setOperatingSystem("IOS");
    apple.setProcessTact(3.0f);
    apple.printInConsole();
    System.out.println();

    Student Jelena = new Student("Jelena", "Bozic", 1930);
    Jelena.printInConsole();
  }
}
