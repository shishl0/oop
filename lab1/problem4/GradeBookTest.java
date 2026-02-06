package lab1.problem4;

import StudentTask.Student;

import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Course course = new Course(
                "CS101 Object-oriented Programming and Design",
                "Intro to OOP: classes, objects, encapsulation",
                5
        );

        GradeBook gb = new GradeBook(course);

        Student[] students = {
                new Student("A", "0"),
                new Student("B", "1"),
                new Student("C", "2"),
                new Student("D", "3"),
                new Student("E", "4"),
                new Student("F", "5"),
                new Student("G", "6"),
                new Student("H", "7"),
                new Student("I", "8"),
                new Student("J", "9")
        };

        for (Student s : students) gb.addStudent(s);

        gb.displayMessage();
        System.out.println("Please, input grades for students:");

        Scanner sc = new Scanner(System.in);

        for (Student s : students) {
            int grade = readGrade(sc, s);
            gb.setGrade(s, grade);
        }

        System.out.println();
        gb.displayGradeReport();
    }

    private static int readGrade(Scanner sc, Student s) {
        while (true) {
            System.out.print("Student " + s.getName() + " (id:" + s.getId() + "): ");
            String token = sc.nextLine().trim();
            try {
                int g = Integer.parseInt(token);
                if (g < 0 || g > 100) {
                    System.out.println("Grade must be 0..100. Try again.");
                    continue;
                }
                return g;
            } catch (NumberFormatException ex) {
                System.out.println("Invalid number. Try again.");
            }
        }
    }
}