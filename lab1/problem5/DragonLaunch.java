package lab1.problem5;

import java.util.Vector;

public class DragonLaunch {
    private final Vector<Person> kidnapped = new Vector<>();

    public void kidnap(Person p) {
        kidnapped.add(p);
    }

    public boolean willDragonEatOrNot() {
        int top = -1;

        for (int i = 0; i < kidnapped.size(); i++) {
            top++;
            kidnapped.set(top, kidnapped.get(i));

            if (top >= 1) {
                Gender g1 = kidnapped.get(top - 1).getGender();
                Gender g2 = kidnapped.get(top).getGender();
                if (g1 == Gender.BOY && g2 == Gender.GIRL) {
                    top -= 2;
                }
            }
        }

        int remaining = top + 1;

        while (kidnapped.size() > remaining) {
            kidnapped.remove(kidnapped.size() - 1);
        }

        return remaining > 0;
    }

    public String remainingAsString() {
        StringBuilder sb = new StringBuilder();
        for (Person p : kidnapped) {
            sb.append(p.getGender() == Gender.BOY ? "B" : "G");
        }
        return sb.toString();
    }
}