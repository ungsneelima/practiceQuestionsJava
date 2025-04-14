package coding;
class Person {
 String name;
 public Person() {
     System.out.println("Person class without passing parametr");
     this.name = "Unknown";
 }
 public Person(String name) {
     System.out.println("Person class passing name as parameter");
     this.name = name;
 }
}
class Student extends Person {
 int studentId;
 public Student() {
     super();
     System.out.println("Student class without passing parameter");
     this.studentId = 0;
 }
 public Student(String name, int studentId) {
     super(name); 
     System.out.println("Student class passing two parameter");
     this.studentId = studentId;
 }
 public void displayDetails() {
     System.out.println("Student Name: " + name);
     System.out.println("Student ID: " + studentId);
 }
}
public class ConstructorHierarchy {
 public static void main(String[] args) {
     System.out.println("Creating Student without parameter");
     Student student1 = new Student();
     System.out.println("\nCreating Student with parameters");
     Student student2 = new Student("Neelima", 37);
     System.out.println("\nStudent 2 Details:");
     student2.displayDetails();
 }
}
