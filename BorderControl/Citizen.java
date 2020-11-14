package BorderControl;

public class Citizen extends Person implements Identifiable, Buyer {
    private final String id;
    private final String birthDate;
    private int food;


    public Citizen(String name, int age, String id, String birthDate) {
        super(name, age);
        this.id = id;
        this.birthDate = birthDate;
        this.food = 0;
    }

    @Override
    public String getId() {
        return this.id;
    }

    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public void buyFood() {
        this.food += 10;
    }

    @Override
    public int getFood() {
        return this.food;
    }
}