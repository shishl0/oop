package TimeTask;

public class Main {
    public static void main(String[] args) {
        Time t = new Time(23, 5, 6);
        System.out.println(t.toUniversal()); // 23:05:06
        System.out.println(t.toStandard());  // 11:05:06 PM

        Time t2 = new Time(4, 24, 33);
        t.add(t2);

        // 23:05:06 + 04:24:33 = 27:29:39 -> wraps to 03:29:39
        System.out.println("After add:");
        System.out.println(t.toUniversal()); // 03:29:39
        System.out.println(t.toStandard());  // 03:29:39 AM
    }
}