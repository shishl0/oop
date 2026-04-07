package lab3.problem4;

import java.util.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee("Alisultan", 500000, new Date(120, 0, 1), "INS001");
        Employee e2 = new Employee("Beksultan", 450000, new Date(122, 5, 15), "INS002");
        Manager m1 = new Manager("Davronbek", 800000, new Date(115, 2, 10), "MGR001", 100000);

        m1.addToTeam(e1);
        m1.addToTeam(e2);

        List<Employee> staff = new ArrayList<>(Arrays.asList(e1, e2, m1));

        System.out.println("--- Sorted by salary (Orig) ---");
        Collections.sort(staff);
        staff.forEach(System.out::println);

        System.out.println("\n--- Sorted by Name ---");
        staff.sort(new NameComparator());
        staff.forEach(System.out::println);

        System.out.println("\n--- Testing Clone ---");
        Manager m2 = (Manager) m1.clone();
        System.out.println("Are m1 and m2 equal? " + m1.equals(m2));
        System.out.println("Are they the same object? " + (m1 == m2));
    }
}