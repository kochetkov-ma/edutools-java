import static java.lang.String.format;

public class UserInformation {
    private final String name;
    private final int age;
    private final double weight;

    public UserInformation(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String printUserInformation() {
        return format("User '%s' %d years old with weight %.2f kg", name, age, weight);
    }
}