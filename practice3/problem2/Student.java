package practice3.problem2;

import java.util.Objects;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = (program == null) ? "" : program.trim();
        this.year = Math.max(year, 0);
        this.fee = Math.max(fee, 0.0);
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = (program == null) ? "" : program.trim();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = Math.max(year, 0);
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = Math.max(fee, 0.0);
    }

    @Override
    public String toString() {
        return "Student[" + super.toString()
                + ",program=" + program
                + ",year=" + year
                + ",fee=" + fee + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return year == student.year &&
               Double.compare(student.fee, fee) == 0 &&
               Objects.equals(program, student.program);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), program, year, fee);
    }
}