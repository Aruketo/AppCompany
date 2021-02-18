package utilities;

public class Age {
    private int age;

    public Age(int age) {
        if (age < 0 || age > 130) {
            throw new IllegalArgumentException("Podany wiek jest niepoprawny.");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
