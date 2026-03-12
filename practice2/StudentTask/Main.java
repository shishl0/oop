package StudentTask;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Bizhan", "032140");
        System.out.println(s.toString());
        System.out.println(s.hashCode());
        System.out.println(s);
    }
}