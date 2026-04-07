package lab3.problem4;

import java.util.Comparator;

class NameComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

class HireDateComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.getHireDate().compareTo(e2.getHireDate());
    }
}