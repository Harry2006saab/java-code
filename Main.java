// Abstract Class
abstract class Employee {
    String name;
    int id;

    // Constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract Method
    abstract double calculateSalary();

    // Normal Method
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

// Full Time Employee Class
class FullTimeEmployee extends Employee {
    double monthlySalary;

    // Constructor
    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    // Implement Abstract Method
    double calculateSalary() {
        return monthlySalary;
    }
}

// Part Time Employee Class
class PartTimeEmployee extends Employee {
    int hoursWorked;
    double ratePerHour;

    // Constructor
    PartTimeEmployee(String name, int id, int hoursWorked, double ratePerHour) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    // Implement Abstract Method
    double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        // Full Time Employee Object
        FullTimeEmployee emp1 = new FullTimeEmployee("Harjot", 101, 50000);

        emp1.displayDetails();
        System.out.println("Full Time Salary: " + emp1.calculateSalary());

        System.out.println("----------------------");

        // Part Time Employee Object
        PartTimeEmployee emp2 = new PartTimeEmployee("Aman", 102, 5, 500);

        emp2.displayDetails();
        System.out.println("Part Time Salary: " + emp2.calculateSalary());
    }
}


























































































































