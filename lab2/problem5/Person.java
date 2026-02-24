package lab2.problem5;

import java.util.Objects;

public abstract class Person {
    private final String name;
    private final int age;
    private Animal pet;

    // to support vacation transfer
    private Person temporaryCaretaker; // who currently holds my pet while I'm away

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.pet = null;
        this.temporaryCaretaker = null;
    }

    public final String getName() { return name; }
    public final int getAge() { return age; }
    public final Animal getPet() { return pet; }

    public final boolean hasPet() { return pet != null; }

    // subclasses may restrict pet assignment
    public void assignPet(Animal pet) {
        if (pet == null) return;
        this.pet = pet;
    }

    public final void removePet() {
        this.pet = null;
    }

    public abstract String getOccupation();

    // ===== Vacation logic =====
    public boolean leavePetWith(Person caretaker) {
        if (caretaker == null) return false;
        if (!hasPet()) return false;
        if (caretaker.hasPet()) return false; // caretaker already has a pet

        // Rule: PhDStudent cannot take care of dogs
        if (caretaker instanceof PhDStudent && this.pet instanceof Dog) return false;

        caretaker.assignPet(this.pet);     // give pet
        this.temporaryCaretaker = caretaker;
        this.removePet();                  // remove from owner
        return true;
    }

    public boolean retrievePetFrom(Person caretaker) {
        if (caretaker == null) return false;
        if (this.temporaryCaretaker == null) return false;
        if (this.temporaryCaretaker != caretaker) return false;
        if (!caretaker.hasPet()) return false;
        if (this.hasPet()) return false; // owner already has a pet

        this.assignPet(caretaker.getPet()); // take back
        caretaker.removePet();
        this.temporaryCaretaker = null;
        return true;
    }

    @Override
    public String toString() {
        return getOccupation() + ": " + name + " (" + age + "y)" +
               (pet == null ? " | pet: none" : " | pet: " + pet);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        // equality for registry: same class + name + age
        return age == person.age &&
               Objects.equals(name, person.name) &&
               Objects.equals(getClass(), person.getClass());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, getClass());
    }
}