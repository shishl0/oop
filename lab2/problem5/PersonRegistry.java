package lab2.problem5;

import java.util.ArrayList;
import java.util.List;

public class PersonRegistry {
    private final List<Person> people = new ArrayList<>();

    public void addPerson(Person p) {
        if (p != null && !people.contains(p)) {
            people.add(p);
        }
    }

    public void removePerson(Person p) {
        people.remove(p);
    }

    public List<Person> findWithPets() {
        List<Person> res = new ArrayList<>();
        for (Person p : people) if (p.hasPet()) res.add(p);
        return res;
    }

    public List<Person> findWithoutPets() {
        List<Person> res = new ArrayList<>();
        for (Person p : people) if (!p.hasPet()) res.add(p);
        return res;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PersonRegistry:\n");
        for (Person p : people) {
            sb.append(" - ").append(p).append("\n");
        }
        return sb.toString();
    }
}