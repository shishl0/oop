package lab2.problem1.c;

import java.util.Objects;

public class ElectricCar extends Vehicle {

    private int batteryCapacity;

    public ElectricCar(String brand, int year, int batteryCapacity) {
        super(brand, year);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ElectricCar)) return false;
        if (!super.equals(o)) return false;

        ElectricCar that = (ElectricCar) o;
        return batteryCapacity == that.batteryCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryCapacity);
    }

    @Override
    public String toString() {
        return super.toString() + ", Battery: " + batteryCapacity + " kWh";
    }
}