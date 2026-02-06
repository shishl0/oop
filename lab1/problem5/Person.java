package lab1.problem5;

public class Person {
    private final Gender gender;
    private final String name;

    public Person(Gender gender, String name) {
        this.gender = gender;
        this.name = name == null ? "" : name.trim();
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{gender=" + gender + ", name='" + name + "'}";
    }
}