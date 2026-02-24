package lab2.problem4;

public abstract class Circuit {

    public abstract double getResistance();
    public abstract double getPotentialDiff();
    public abstract void applyPotentialDiff(double V);

    public double getPower() {
        double R = getResistance();
        if (R == 0) return 0;
        double V = getPotentialDiff();
        return (V * V) / R;
    }

    public double getCurrent() {
        double R = getResistance();
        if (R == 0) return 0;
        return getPotentialDiff() / R;
    }
}