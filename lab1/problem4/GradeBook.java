package lab1.problem4;

import StudentTask.Student;
import java.util.LinkedHashMap;
import java.util.Map;

public class GradeBook {
    private final Course course;
    private final LinkedHashMap<Student, Integer> grades;

    public GradeBook(Course course) {
        this.course = course;
        this.grades = new LinkedHashMap<>();
    }

    public void addStudent(Student s) {
        grades.putIfAbsent(s, 0);
    }

    public void setGrade(Student s, int grade) {
        grades.put(s, grade);
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName() + "!");
    }

    public void displayGradeReport() {
        if (grades.isEmpty()) {
            System.out.println("No students in grade book.");
            return;
        }

        double avg = determineClassAverage();
        Student minS = getMinimumStudent();
        Student maxS = getMaximumStudent();
        int minG = grades.get(minS);
        int maxG = grades.get(maxS);

        System.out.printf("Class average is %.2f. Lowest grade is %d (Student %s, id: %d).%n",
                avg, minG, minS.getName(), minS.getId());

        System.out.printf("Highest grade is %d (Student %s, id: %d).%n",
                maxG, maxS.getName(), maxS.getId());

        outputBarChart();
    }

    public double determineClassAverage() {
        int sum = 0;
        for (int g : grades.values()) sum += g;
        return (double) sum / grades.size();
    }

    private Student getMinimumStudent() {
        Student best = null;
        int bestGrade = Integer.MAX_VALUE;
        for (Map.Entry<Student, Integer> e : grades.entrySet()) {
            if (e.getValue() < bestGrade) {
                bestGrade = e.getValue();
                best = e.getKey();
            }
        }
        return best;
    }

    private Student getMaximumStudent() {
        Student best = null;
        int bestGrade = Integer.MIN_VALUE;
        for (Map.Entry<Student, Integer> e : grades.entrySet()) {
            if (e.getValue() > bestGrade) {
                bestGrade = e.getValue();
                best = e.getKey();
            }
        }
        return best;
    }

    public void outputBarChart() {
        System.out.println("Grades distribution:");

        int[] freq = new int[11];

        for (int g : grades.values()) {
            if (g == 100) freq[10]++;
            else freq[g / 10]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (i == 10) System.out.print("100: ");
            else System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);

            for (int star = 0; star < freq[i]; star++) System.out.print("*");
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "GradeBook{course=" + course + ", students=" + grades.size() + "}";
    }
}