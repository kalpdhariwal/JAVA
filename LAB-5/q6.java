class Employee {

    int employeeID;
    String name;
    String department;
    private double salary;

    static int totalEmployees = 0;

    Employee() {
        this.employeeID = 106;
        this.name = "Kalp";
        this.department = "ICT";
        this.salary = 10000.0;
        totalEmployees++;
    }

    Employee(int employeeID, String name, String department, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.salary = salary;
        totalEmployees++;
    }

    static void showTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    double calculateSalary() {
        return salary;
    }

    double calculateSalary(double bonus) {
        return salary + bonus;
    }
    
    void displayEmployeeInfo() {
        System.out.println("ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("-------------------");
    }
}

public class q6 {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        Employee emp2 = new Employee(121, "Samarth", "IT", 500000);

        Employee.showTotalEmployees();

        emp1.displayEmployeeInfo();
        emp2.displayEmployeeInfo();

        System.out.println("Salary of emp2: " + emp2.calculateSalary());
        System.out.println("Salary with Bonus: " + emp2.calculateSalary(1000));
        System.out.println("-------------------");
        System.out.println("24BIT106 Kalp N Dhariwal");
    }
}