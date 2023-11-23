public class StudentConstructor{
     public static void main(String[] args) {
        // Default constructor
        Student telebe1 = new Student();
        // 1 parametrli constructor
        Student telebe2 = new Student("Nermin");
        // 2 parametrli constructor
        Student telebe3 = new Student("Nermin", "Sadiqli");
        // 3 parametrli constructor
        Student telebe4 = new Student("Nermin", "Sadiqli", 92.5);
        Student.displayObjectCount();
    }
static class Student {
    public static int objectCount = 0;
    public String name;
    public String surname;
    public Double gpa;

    // Default constructor
    public Student() {
        objectCount++;
    }

    // 1 parametrli constructor
    public Student(String name) {
        this.name = name;
        objectCount++;
    }

    // 2 parametrli constructor
    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        objectCount++;
    }

    // 3 parametrli constructor
    public Student(String name, String surname, Double gpa) {
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
        objectCount++;
    }

    // displayObjectCount methodu
    public static void displayObjectCount() {
        System.out.println("Obyekt sayi: " + objectCount);
    }

} 
}
