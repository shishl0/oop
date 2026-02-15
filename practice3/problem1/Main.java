package practice3.problem1;

public class Main {
    public static void main(String[] args) {
        // super() without params (Cat() -> super())
        Cat c1 = new Cat();
        System.out.println(c1.info());
        c1.speak();

        // super(...) with params (Cat(name, age, breed) -> super(name, age))
        Cat c2 = new Cat("Luna", 3, "Scottish Fold");
        System.out.println(c2.info());
        c2.speak();

        c2.eat();
        c2.eat("fish");
        c2.eat("chicken", 120);

        c2.play();
        c2.play("laser pointer");

        Animal a = c2;         // upcast
        a.speak();             // calls Cat.speak() because of overriding
        System.out.println(a.info()); // calls Cat.info() because overridden too
    }
}