package utilities;

public class Age {
    private final int age;

    public Age(final int age) {
        if (age < 0 || age > 130) {
            throw new IllegalArgumentException("Podany wiek jest niepoprawny");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
