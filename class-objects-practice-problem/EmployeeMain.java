class Employee {
    String name;
    int id;
    double salary;

    // Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Krishna", 101, 45000.50);
        emp1.displayDetails();
    }
}
