package Demo;

public interface Animal {
    void eat();

    default void drink() {
        System.out.println("is drinking");
    }
}

