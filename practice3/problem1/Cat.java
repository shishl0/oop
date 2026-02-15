package practice3.problem1;

public class Cat extends Animal {
    private String breed;

    public Cat() {
        super(); // without parameters 
        this.breed = "Mixed";
    }

    public Cat(String name, int age, String breed) {
        super(name, age); // with parameters
        this.breed = (breed == null || breed.isBlank()) ? "Mixed" : breed;
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Meow!");
    }

    @Override
    public String info() {
        return "Cat{name='" + name + "', age=" + age + ", breed='" + breed + "'}";
    }

    public void play() {
        System.out.println(name + " plays with a toy.");
    }

    public void play(String toy) {
        System.out.println(name + " plays with " + toy + ".");
    }
}