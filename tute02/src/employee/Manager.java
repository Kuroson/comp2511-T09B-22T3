package employee;

import java.time.LocalDate;

/**
 * Create a `Manager` class that is a subclass of `Employee`
 * and has a field for the manager's hire date.
 */
public class Manager extends Employee {
    private LocalDate hireDate;

    public Manager(String name, double salary, LocalDate hireDate) {
        super(name, salary);
        this.hireDate = hireDate;
        this.name = "Hello";
    }

    @Override
    public String toString() {
        return super.toString() + " , " + this.hireDate;
    }

    public boolean equals(Object o) {
        if (!super.equals(o)) {
            return false;
        }
        //  check hireDate after
        return true;
    }
}
