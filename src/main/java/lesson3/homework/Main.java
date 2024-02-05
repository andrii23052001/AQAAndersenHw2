package lesson3.homework;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("John Doe", "Developer", "john.doe@example.com", "123-456-7890", 50000.0, 30);
        employees[1] = new Employee("Jane Smith", "Manager", "jane.smith@example.com", "987-654-3210", 60000.0, 35);
        employees[2] = new Employee("Bob Johnson", "Designer", "bob.johnson@example.com", "456-789-0123", 55000.0, 28);
        employees[3] = new Employee("Alice Brown", "Engineer", "alice.brown@example.com", "789-012-3456", 65000.0, 40);
        employees[4] = new Employee("Sam Wilson", "Analyst", "sam.wilson@example.com", "012-345-6789", 70000.0, 45);

        showEmployeesWithAgeGreaterThan40Age(employees);

    }
    public static void showEmployeesWithAgeGreaterThan40Age(Employee[] employees) {
        for (Employee e : employees) {
            if (e.getAge() >= 40) e.show();
        }
    }
}