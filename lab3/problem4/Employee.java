package lab3.problem4;

import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
    private double salary;
    private Date hireDate;
    private String insuranceNumber;

    public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    @Override
    public String toString() {
        return String.format("Employee[name=%s, salary=%.2f, hired=%s, insurance=%s]",
                getName(), salary, hireDate, insuranceNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o))
            return false;
        if (!(o instanceof Employee))
            return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(hireDate, employee.hireDate) &&
                Objects.equals(insuranceNumber, employee.insuranceNumber);
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        cloned.hireDate = (Date) this.hireDate.clone();
        return cloned;
    }
}