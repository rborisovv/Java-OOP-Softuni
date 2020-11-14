package BorderControl;

public abstract class Person implements Buyer {
    private final String name;
    private final int age;

    protected Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}