package lab1.problem1;

import java.util.Scanner;

public class Analyzer {

    public void run() {
        Scanner scan = new Scanner(System.in);
        Data data = new Data();

        while (true) {
            System.out.print("Enter number (Q to quit): ");
            String token = scan.nextLine().trim();

            if (token.equalsIgnoreCase("Q")) {
                break;
            }

            try {
                double value = Double.parseDouble(token);
                data.addValue(value);
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input. Please enter a number or Q.");
            }
        }

        System.out.printf("Average = %.2f%n", data.getAverage());
        System.out.printf("Maximum = %.2f%n", data.getLargest());
    }
}