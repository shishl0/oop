package practice3.problem2;

import java.util.Objects;

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = (school == null) ? "" : school.trim();
        this.pay = Math.max(pay, 0.0);
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = (school == null) ? "" : school.trim();
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = Math.max(pay, 0.0);
    }

    @Override
    public String toString() {
        return "Staff[" + super.toString()
                + ",school=" + school
                + ",pay=" + pay + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Staff staff = (Staff) o;
        return Double.compare(staff.pay, pay) == 0 &&
               Objects.equals(school, staff.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), school, pay);
    }
}