package lab2.problem4;

public class Series extends Circuit {

    private final Circuit c1;
    private final Circuit c2;
    private double potentialDifference;

    public Series(Circuit c1, Circuit c2) {
        this.c1 = c1;
        this.c2 = c2;
        this.potentialDifference = 0.0;
    }

    @Override
    public double getResistance() {
        return c1.getResistance() + c2.getResistance();
    }

    @Override
    public double getPotentialDiff() {
        return potentialDifference;
    }

    @Override
    public void applyPotentialDiff(double V) {
        this.potentialDifference = V;

        double Rtotal = getResistance();
        if (Rtotal == 0) {
            c1.applyPotentialDiff(0);
            c2.applyPotentialDiff(0);
            return;
        }

        // same current in series: I = V / Rtotal
        double I = V / Rtotal;

        // V1 = I * R1, V2 = I * R2
        double V1 = I * c1.getResistance();
        double V2 = I * c2.getResistance();

        c1.applyPotentialDiff(V1);
        c2.applyPotentialDiff(V2);
    }
}