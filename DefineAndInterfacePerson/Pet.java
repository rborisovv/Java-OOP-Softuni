package DefineAndInterfacePerson;

public class Pet implements Birthable {
    private final String name;
    private final String birthDay;

    public Pet(String name, String birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getBirthDate() {
        return this.birthDay;
    }
}
