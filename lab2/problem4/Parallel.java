package lab2.problem4;

public class Parallel extends Circuit {

    private final Circuit c1;
    private final Circuit c2;
    private double potentialDifference;

    public Parallel(Circuit c1, Circuit c2) {
        this.c1 = c1;
        this.c2 = c2;
        this.potentialDifference = 0.0;
    }

    @Override
    public double getResistance() {
        double R1 = c1.getResistance();
        double R2 = c2.getResistance();

        // handle edge cases
        if (R1 == 0 && R2 == 0) return 0;
        if (R1 == 0) return 0;
        if (R2 == 0) return 0;

        return 1.0 / (1.0 / R1 + 1.0 / R2);
    }

    @Override
    public double getPotentialDiff() {
        return potentialDifference;
    }

    @Override
    public void applyPotentialDiff(double V) {
        this.potentialDifference = V;

        // same voltage across each branch in parallel
        c1.applyPotentialDiff(V);
        c2.applyPotentialDiff(V);
    }
}