package lab2.problem5;

public class Student extends Person {
    private final String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public String getOccupation() {
        return "Student(" + major + ")";
    }
}