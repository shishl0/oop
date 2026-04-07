package lab3.problem5;

import lab3.problem4.Employee;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Chocolate[] chocolates = {
                new Chocolate("Twix", 50.5),
                new Chocolate("Snickers", 80.0),
                new Chocolate("Mars", 45.0)
        };
        Sort.bubbleSort(chocolates);
        System.out.println("Sorted Chocolates: " + java.util.Arrays.toString(chocolates));

        Time[] times = {
                new Time(23, 50, 12),
                new Time(10, 15, 12),
                new Time(10, 0, 12)
        };
        Sort.mergeSort(times);
        System.out.println("Sorted Times: " + java.util.Arrays.toString(times));

        Employee[] employees = {
                new Employee("Alice", 50000, new Date(), "INS001"),
                new Employee("Bob", 60000, new Date(), "INS002"),
                new Employee("Charlie", 45000, new Date(), "INS003")
        };
        Sort.bubbleSort(employees);
        System.out.println("Sorted Employees: " + java.util.Arrays.toString(employees));
    }
}
