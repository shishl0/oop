package lab3.problem1.Abstraction;

public class Apartment extends Habitation {
    private int floor;

    public Apartment(String address, double squareMeters, int floor) {
        super(address, squareMeters);
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    @Override
    public double calculateMonthlyFees() {
        return squareMeters * 1.5 + 50.0;
    }
}

// abstract class is a class that cannot be instantiated. It is used to define
// a common interface for a group of related classes.
// A class can only extend one abstract class.