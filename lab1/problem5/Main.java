package lab1.problem5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter line (e.g., BBGG, GBGB): ");
        String line = sc.nextLine().trim().toUpperCase();

        DragonLaunch dl = new DragonLaunch();

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c == 'B') dl.kidnap(new Person(Gender.BOY, "B" + i));
            else if (c == 'G') dl.kidnap(new Person(Gender.GIRL, "G" + i));
        }

        boolean eat = dl.willDragonEatOrNot();
        System.out.println("Remaining: " + dl.remainingAsString());
        System.out.println(eat ? "Dragon will eat." : "No lunch for dragon.");
    }
}