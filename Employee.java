package java2projects;

class Employee {
    // Fields (Attributes of an Employee)
    String name;
    int employeeId;
    double salary;

    // Constructor to initialize the Employee object
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Method (Behavior: Displaying employee details)
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + salary);
        System.out.println("-------------------------");
    }


 
    public static void main(String[] args) {
        // Create (instantiate) two Employee objects
        Employee emp1 = new Employee("Kirti Poddar", 101, 65000.00);
        Employee emp2 = new Employee("Swati Poddar", 102, 72000.00);

        // Call the displayDetails method for each object
        System.out.println("--- Employee Records ---");
        emp1.displayDetails();
        emp2.displayDetails();
    }
}

