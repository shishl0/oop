package lab1.problem3;

public class Main {
    public static void main(String[] args) {
        Temperature t1 = new Temperature();
        Temperature t2 = new Temperature(36.6);
        Temperature t3 = new Temperature('F');
        Temperature t4 = new Temperature(98.6, 'F');

        System.out.println("t1: " + t1 + " | C=" + t1.getCelsius() + " F=" + t1.getFahrenheit());
        System.out.println("t2: " + t2 + " | C=" + t2.getCelsius() + " F=" + t2.getFahrenheit());
        System.out.println("t3: " + t3 + " | C=" + t3.getCelsius() + " F=" + t3.getFahrenheit());
        System.out.println("t4: " + t4 + " | C=" + t4.getCelsius() + " F=" + t4.getFahrenheit());
    }
}