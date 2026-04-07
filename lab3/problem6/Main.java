package lab3.problem6;

import java.util.Arrays;
import java.util.Date;
import lab3.problem5.Chocolate;
import lab3.problem4.Employee;
import lab3.problem5.Time;
import lab3.problem5.Sort;

public class Main {
    public static void main(String[] args) {
        // 1. Sorting choco by weight
        Chocolate[] chocolates = {
                new Chocolate("Snickers", 95),
                new Chocolate("Twix", 50),
                new Chocolate("Kazakhstan", 100)
        };
        Sort.bubbleSort(chocolates);
        System.out.println("Chocolates: " + Arrays.toString(chocolates));

        // 2. Sorting time by hours/minutes
        Time[] times = {
                new Time(12, 30),
                new Time(8, 45),
                new Time(12, 0)
        };
        Sort.bubbleSort(times);
        System.out.println("Times: " + Arrays.toString(times));

        // 3. Sorting employees by salary
        Employee[] employees = {
                new Employee("Ivanushka", 300000, new Date(), "ID01"),
                new Employee("Ushka", 550000, new Date(), "ID02"),
                new Employee("Dushka", 400000, new Date(), "ID03")
        };
        Sort.bubbleSort(employees);
        System.out.println("Employees: " + Arrays.toString(employees));

        Person student = new Person("Alisher", 19, "060317XXXXXX");
        Dog rex = new Dog("Rex", 15.5, "CHIP123");

        System.out.println(student.makeSound() + " (ID: " + student.getId() + ")");
        System.out.println("Dog says: " + rex.makeSound() + " (ID: " + rex.getId() + ")");
    }
}