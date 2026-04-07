package lab3.problem4;

import java.util.Vector;
import java.util.Objects;
import java.util.Date;

public class Manager extends Employee {
    private Vector<Employee> team;
    private double bonus;

    public Manager(String name, double salary, Date hireDate, String insuranceNumber, double bonus) {
        super(name, salary, hireDate, insuranceNumber);
        this.team = new Vector<>();
        this.bonus = bonus;
    }

    public void addToTeam(Employee e) {
        team.add(e);
    }

    @Override
    public int compareTo(Employee other) {
        int res = super.compareTo(other);

        if (res == 0 && other instanceof Manager) {
            return Double.compare(this.bonus, ((Manager) other).bonus);
        }
        return res;
    }

    @Override
    public String toString() {
        return super.toString() + " [Bonus: " + bonus + ", Team size: " + team.size() + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o))
            return false;
        if (!(o instanceof Manager))
            return false;
        Manager manager = (Manager) o;
        return Double.compare(manager.bonus, bonus) == 0 &&
                Objects.equals(team, manager.team);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Manager cloned = (Manager) super.clone();
        cloned.team = new Vector<>(this.team);
        return cloned;
    }
}