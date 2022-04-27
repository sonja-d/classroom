public class Main {
  public static void main(String[] args) {
    System.out.println("Classroom details: ");
    System.out.println();
    
    Computer apple = new Computer("MacBook Pro", "macOS", 3.0f, 64, 256);
    Computer dell = new Computer("Dell", "Windows", 2.4f, 16, 512);
    Computer lenovo = new Computer("Chromebook", "Fedora 33", 2.4f, 128, 256);
    
    Course courseJava = new Course("Java", 5, "Java-33");
    Course selenium = new Course("Selenium", 7, "SEL-12");
    Course qaCourse = new Course("QA", 4, "QA-22");

    Student Maja = new Student("Maja", "Zivic", 1988, courseJava, apple);
    Maja.printInConsole();

    Student Jelena = new Student("Jelena", "Bozic", 1930, qaCourse, dell);
    Jelena.printInConsole();

    Student Sonja = new Student("Sonja", "Nikolic", 1987);
    Sonja.printInConsole();
  }
}
