abstract class Employee {
    abstract double calculateSalary();
    abstract void displayDetails();
}
class Manager extends Employee {
    String name;
    String role;
    double monthlySalary;
    Manager(String name, String role, double monthlySalary) {
        this.name = name;
        this.role = role;
        this.monthlySalary = monthlySalary;
    }
    double calculateSalary() {
        return monthlySalary;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: " + calculateSalary());
    }
}
class Developer extends Employee {
    String name;
    String role;
    double hourlyWage;
    int hoursWorked;
    Developer(String name, String role, double hourlyWage, int hoursWorked) {
        this.name = name;
        this.role = role;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }
    double calculateSalary() {
        return hourlyWage * hoursWorked;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: " + calculateSalary());
    }
}
public class Q2 {
    public static void main(String[] args) {
        Manager m = new Manager("Rahul", "Marketing Manager", 80000);
        Developer d = new Developer("Rohan", "Software Developer", 500, 160);
        m.displayDetails();
        System.out.println();
        d.displayDetails();
        System.out.println("24BIT106 Kalp N Dhariwal");
    }
}