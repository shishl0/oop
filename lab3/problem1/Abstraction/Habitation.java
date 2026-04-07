package lab3.problem1.Abstraction;

public abstract class Habitation {
    private String address;
    protected double squareMeters;

    public Habitation(String address, double squareMeters) {
        this.address = address;
        this.squareMeters = squareMeters;
    }

    public String getAddress() {
        return address;
    }

    public abstract double calculateMonthlyFees();
}
