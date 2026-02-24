package lab2.problem5;

public class PhDStudent extends Student {
    private final String researchTopic; // new field

    public PhDStudent(String name, int age, String major, String researchTopic) {
        super(name, age, major);
        this.researchTopic = researchTopic;
    }

    @Override
    public String getOccupation() {
        return "PhDStudent(" + researchTopic + ")";
    }

    @Override
    public void assignPet(Animal pet) {
        if (pet instanceof Dog) {
            // not allowed
            return;
        }
        super.assignPet(pet);
    }
}