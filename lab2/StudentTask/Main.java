package StudentTask;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Bizhan", 032140);

        System.out.println("Name: " + s.getName());
        System.out.println("ID: " + s.getId());
        System.out.println("Year: " + s.getYearOfStudy());

        s.incrementYearOfStudy();

        System.out.println("After increment:");
        System.out.println("Year: " + s.getYearOfStudy());
    }
}