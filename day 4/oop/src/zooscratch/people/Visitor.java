package zooscratch.people;

// to inherit from human class
public class Visitor extends Human {
    public String name;
    private int age;

    public int getAge() {
        return super.getAge(); // higher
    }
}
