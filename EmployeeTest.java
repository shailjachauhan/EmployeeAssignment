public class EmployeeTest {
    public static void main(String[] args) {
        // Creating an Employee object using the constructor
        Employee employee = new Employee("Shailja Chauhan", 24, "Software Developer", 90000.0);
        
        // Displaying employee information
        System.out.println("Employee Information:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Designation: " + employee.getDesignation());
        System.out.println("Salary: $" + employee.getSalary());
}
}
