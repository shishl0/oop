package lab2.problem5;

public class Main {
    public static void main(String[] args) {

        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Comp. Science", "AI");

        Animal murka = new Cat("Murka", 5);
        Animal rex = new Dog("Rex", 3);

        john.assignPet(rex);   // John owns Rex
        alice.assignPet(murka); // Alice owns Murka (ok)

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);

        System.out.println("Initial:");
        System.out.println(registry);

        // John goes on vacation and tries to leave Rex with Alice (PhDStudent) -> should FAIL
        boolean left = john.leavePetWith(alice);
        System.out.println("John leave dog with Alice: " + left);
        System.out.println(registry);

        // John leaves Rex with a regular Student (allowed)
        Person bob = new Student("Bob", 20, "Math");
        registry.addPerson(bob);

        left = john.leavePetWith(bob);
        System.out.println("John leave dog with Bob: " + left);
        System.out.println(registry);

        // John returns
        boolean back = john.retrievePetFrom(bob);
        System.out.println("John retrieves dog from Bob: " + back);
        System.out.println(registry);
    }
}