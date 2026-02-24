package lab2.problem4;

public class Main {
    public static void main(String[] args) {

        Circuit a = new Resistor(3.0);
        Circuit b = new Resistor(3.0);
        Circuit c = new Resistor(6.0);
        Circuit d = new Resistor(3.0);
        Circuit e = new Resistor(2.0);

        Circuit f = new Series(a, b);
        Circuit g = new Parallel(c, d);
        Circuit h = new Series(g, e);
        Circuit circuit = new Parallel(h, f);

        double R = circuit.getResistance();
        System.out.println("Equivalent R = " + R + " ohms");

        circuit.applyPotentialDiff(12.0); // apply 12V to whole circuit

        System.out.println("Circuit V = " + circuit.getPotentialDiff());
        System.out.println("Circuit I = " + circuit.getCurrent());
        System.out.println("Circuit P = " + circuit.getPower());

        // You can also inspect subcircuits:
        System.out.println("f (series a+b) R = " + f.getResistance() + ", V = " + f.getPotentialDiff());
        System.out.println("h (series (c||d)+e) R = " + h.getResistance() + ", V = " + h.getPotentialDiff());
    }
}