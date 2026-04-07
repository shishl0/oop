package lab3.problem6;

public abstract class Animal implements Comparable<Animal>, Cloneable, SoundMaker, Identifiable {
    private String nickname;
    private double weight;
    private String chipId;

    public Animal(String nickname, double weight, String chipId) {
        this.nickname = nickname;
        this.weight = weight;
        this.chipId = chipId;
    }

    public String getNickname() {
        return nickname;
    }

    public double getWeight() {
        return weight;
    }

    public String getChipId() {
        return chipId;
    }

    @Override
    public int compareTo(Animal other) {
        return Double.compare(this.weight, other.weight); // Сравнение по весу
    }

    @Override
    public String getId() {
        return chipId;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Dog extends Animal {
    public Dog(String nickname, double weight, String chipId) {
        super(nickname, weight, chipId);
    }

    @Override
    public String makeSound() {
        return "Woof-Woof!";
    }
}
