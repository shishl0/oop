package practice3.problem2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static final String LINE = "--------------------------------------------";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Person> users = new HashSet<>();

        // немного тестовых данных (можно убрать)
        users.add(new Person("Evgen", "Almaty"));
        users.add(new Student("Zhan", "Almaty", "IS", 2, 1200000));
        users.add(new Staff("Rasul", "Astana", "KBTU", 300000));

        while (true) {
            System.out.println("\n" + LINE);
            System.out.println("1) Print all users");
            System.out.println("2) Add new user");
            System.out.println("0) Exit");
            System.out.print("Choose: ");

            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1" -> printAll(users);
                case "2" -> addUser(sc, users);
                case "0" -> {
                    System.out.println("Bye.");
                    return;
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void printAll(Set<Person> users) {
        System.out.println("\nUsers count: " + users.size());
        if (users.isEmpty()) {
            System.out.println("(empty)");
            return;
        }
        for (Person p : users) {
            System.out.println(p);
        }
    }

    private static void addUser(Scanner sc, Set<Person> users) {
        System.out.println("\nAdd which type?");
        System.out.println("1) Person");
        System.out.println("2) Student");
        System.out.println("3) Staff");
        System.out.print("Choose: ");
        String type = sc.nextLine().trim();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Address: ");
        String address = sc.nextLine();

        Person created;

        switch (type) {
            case "1" -> created = new Person(name, address);
            case "2" -> {
                System.out.print("Program: ");
                String program = sc.nextLine();
                int year = readInt(sc, "Year (int): ");
                double fee = readDouble(sc, "Fee (double): ");
                created = new Student(name, address, program, year, fee);
            }
            case "3" -> {
                System.out.print("School: ");
                String school = sc.nextLine();
                double pay = readDouble(sc, "Pay (double): ");
                created = new Staff(name, address, school, pay);
            }
            default -> {
                System.out.println("Invalid type.");
                return;
            }
        }

        boolean added = users.add(created);
        if (added) System.out.println("Added: " + created);
        else System.out.println("Not added (duplicate in HashSet): " + created);
    }

    private static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine().trim();
            try {
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Invalid int. Try again.");
            }
        }
    }

    private static double readDouble(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine().trim().replace(',', '.');
            try {
                return Double.parseDouble(s);
            } catch (NumberFormatException e) {
                System.out.println("Invalid double. Try again.");
            }
        }
    }
}