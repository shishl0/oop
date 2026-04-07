package lab3.problem5;

public class Time implements Comparable<Time> {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public Time(int hour, int minute) {
        this(hour, minute, 0);
    }

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour > 23) {
            System.out.println("Invalid hour: " + hour + " (must be 0..23)");
            System.exit(1);
        }
        if (minute < 0 || minute > 59) {
            System.out.println("Invalid minute: " + minute + " (must be 0..59)");
            System.exit(1);
        }
        if (second < 0 || second > 59) {
            System.out.println("Invalid second: " + second + " (must be 0..59)");
            System.exit(1);
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard() {
        String suffix = (hour < 12) ? "AM" : "PM";
        int hour12 = hour % 12;
        if (hour12 == 0)
            hour12 = 12;

        return String.format("%02d:%02d:%02d %s", hour12, minute, second, suffix);
    }

    public void add(Time other) {
        int totalSeconds = this.hour * 3600 + this.minute * 60 + this.second
                + other.hour * 3600 + other.minute * 60 + other.second;

        totalSeconds %= (24 * 3600);

        this.hour = totalSeconds / 3600;
        totalSeconds %= 3600;
        this.minute = totalSeconds / 60;
        this.second = totalSeconds % 60;
    }

    @Override
    public int compareTo(Time other) {
        if (this.hour != other.hour) {
            return Integer.compare(this.hour, other.hour);
        }
        if (this.minute != other.minute) {
            return Integer.compare(this.minute, other.minute);
        }
        return Integer.compare(this.second, other.second);
    }

    @Override
    public String toString() {
        return toUniversal();
    }
}