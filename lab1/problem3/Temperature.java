package lab1.problem3;

public class Temperature {
    private double value;
    private char scale;

    public Temperature() {
        this(0.0, 'C');
    }

    public Temperature(double value) {
        this(value, 'C');
    }

    public Temperature(char scale) {
        this(0.0, scale);
    }

    public Temperature(double value, char scale) {
        this.value = value;
        setScale(scale);
    }

    public double getCelsius() {
        if (scale == 'C') return value;
        // degreesC = 5(degreesF - 32) / 9
        return 5.0 * (value - 32.0) / 9.0;
    }

    public double getFahrenheit() {
        if (scale == 'F') return value;
        // degreesF = 9(degreesC / 5) + 32
        return 9.0 * (value / 5.0) + 32.0;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        char s = Character.toUpperCase(scale);
        if (s != 'C' && s != 'F') {
            s = 'C';
        }
        this.scale = s;
    }

    public void setBoth(double value, char scale) {
        this.value = value;
        setScale(scale);
    }

    public char getScale() {
        return scale;
    }

    @Override
    public String toString() {
        return String.format("%.1f %c", value, scale);
    }
}