package practice3.problem2;

import java.util.Objects;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = (name == null) ? "" : name.trim();
        this.address = (address == null) ? "" : address.trim();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = (address == null) ? "" : address.trim();
    }

    @Override
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
               Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }
}