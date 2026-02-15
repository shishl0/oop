package practice3.problem1;

public class Animal {
    protected String name;
    protected int age;

    public Animal() {
        this.name = "Unknown";
        this.age = 0;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = Math.max(age, 0);
    }

    public void speak() {
        System.out.println(name + " makes a sound.");
    }

    public void eat() {
        System.out.println(name + " eats some food.");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food + ".");
    }

    public void eat(String food, int grams) {
        if (grams < 0) grams = 0;
        System.out.println(name + " eats " + grams + "g of " + food + ".");
    }

    public String info() {
        return "Animal{name='" + name + "', age=" + age + "}";
    }
}