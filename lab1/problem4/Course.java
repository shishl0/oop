package lab1.problem4;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private final String name;
    private final String description;
    private final int credits;
    private final List<String> prerequisites;

    public Course(String name, String description, int credits) {
        this(name, description, credits, new ArrayList<>());
    }

    public Course(String name, String description, int credits, List<String> prerequisites) {
        this.name = name == null ? "Unnamed course" : name.trim();
        this.description = description == null ? "" : description.trim();
        this.credits = Math.max(0, credits);
        this.prerequisites = prerequisites == null ? new ArrayList<>() : new ArrayList<>(prerequisites);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Course{name='" + name + "', credits=" + credits +
                ", prerequisites=" + prerequisites + ", description='" + description + "'}";
    }
}