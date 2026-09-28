package Asociacion;

public class Employee {

    // Attributes of employee
    private String name;

    // Constructor of Employee class
    public Employee(String name) {
        // this keyword refers to current instance
        this.name = name;
    }

    // Method of Employee class
    public String getEmployeeName() {
        // returning the name of employee
        return this.name;
    }
}
