import java.util.ArrayList;
import java.util.Scanner;

// Student Class
class Student {
    private int id;
    private String name;
    private int age;
    private String course;
    private double marks;

    // Constructor
    public Student(int id, String name, int age, String course, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }

    // Getter Methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    // Setter Method
    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Display Method
    public void displayStudent() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("---------------------------");
    }
}

// Main Class
public class StudentManagementSystem {

    static ArrayList<Student> studentList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    updateMarks();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);
    }

    // Add Student
    public static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        Student s = new Student(id, name, age, course, marks);
        studentList.add(s);

        System.out.println("Student Added Successfully!");
    }

    // View All Students
    public static void viewStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No Students Found!");
            return;
        }

        for (Student s : studentList) {
            s.displayStudent();
        }
    }

    // Search Student
    public static void searchStudent() {
        System.out.print("Enter ID to Search: ");
        int id = sc.nextInt();

        for (Student s : studentList) {
            if (s.getId() == id) {
                s.displayStudent();
                return;
            }
        }

        System.out.println("Student Not Found!");
    }

    // Update Marks
    public static void updateMarks() {
        System.out.print("Enter ID to Update Marks: ");
        int id = sc.nextInt();

        for (Student s : studentList) {
            if (s.getId() == id) {
                System.out.print("Enter New Marks: ");
                double newMarks = sc.nextDouble();
                s.setMarks(newMarks);
                System.out.println("Marks Updated Successfully!");
                return;
            }
        }

        System.out.println("Student Not Found!");
    }

    // Delete Student
    public static void deleteStudent() {
        System.out.print("Enter ID to Delete: ");
        int id = sc.nextInt();

        for (Student s : studentList) {
            if (s.getId() == id) {
                studentList.remove(s);
                System.out.println("Student Deleted Successfully!");
                return;
            }
        }

        System.out.println("Student Not Found!");
    }
}

