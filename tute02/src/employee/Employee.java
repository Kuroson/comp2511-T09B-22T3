package employee;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Create an `Employee` class which has private fields for
 * an employee's name and salary and appropriate getters,
 * setters, and constructors. Document the class with JavaDoc.
 */
public class Employee {
    protected String name;
    private double salary;

    /**
     * Creates a new Employee
     * @param name name of the employee
     * @param salary salary of the employee
     */
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * Gets the employee's name
     * @return strings of employees name
     */
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.name + " , " + this.salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) // Equal to itself
            return true;
        if ((o.getClass() != this.getClass())) { // Not the same type
            return false;
        }
        Employee employee = (Employee) o; // Typecasting
        // Comparing the attributes
        return Objects.equals(name, employee.name) && salary == employee.salary;
    }

}
