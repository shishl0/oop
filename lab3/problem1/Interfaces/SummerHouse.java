package lab3.problem1.Interfaces;

import lab3.problem1.Abstraction.Habitation;

public class SummerHouse extends Habitation implements Rentable, Insurable {
    private double rentPrice;

    public SummerHouse(String address, double squareMeters) {
        super(address, squareMeters);
    }

    @Override
    public double calculateMonthlyFees() {
        return squareMeters * 0.5;
    }

    @Override
    public void setRentPrice(double price) {
        this.rentPrice = price;
    }

    @Override
    public double getRentPrice() {
        return rentPrice;
    }

    @Override
    public double calculateInsurancePremium() {
        return squareMeters * 10.0;
    }
}

// basically interfaces describes what a class can do. For example
// a class SummerHouse can be a Habitation and a Rentable and a Insurable at the
// same time.
// We describe those abilities using interfaces and apply by implementing the
// interface.
// A class can implement multiple interfaces.
