package Asociacion;
import java.util.Set;

public class Bank {

    // Attributes of bank
    private String bankName;
    private Set<Employee> employees;

    // Constructor of Bank class
    public Bank(String bankName)
    {
        this.bankName = bankName;
    }

    // Method of Bank class
    public String getBankName()
    {
        // Returning name of bank
        return this.bankName;
    }

    public void setEmployees(Set<Employee> employees)
    {
        this.employees = employees;
    }

    public Set<Employee> getEmployees()
    {
        return this.employees;
    }
}
