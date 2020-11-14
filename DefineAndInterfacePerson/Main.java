package DefineAndInterfacePerson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = bufferedReader.readLine();
        List<Birthable> breathingBeings = new ArrayList<>();

        while (!input.equals("End")) {

            String[] tokens = input.split("\\s+");

            if (tokens[0].equals("Citizen")) {
                addCitizen(breathingBeings, tokens);
            } else if (tokens[0].equals("Pet")) {
                addPet(breathingBeings, tokens);
            }

            input = bufferedReader.readLine();
        }
        String year = bufferedReader.readLine();
        for (Birthable breathingBeing : breathingBeings) {
            if (breathingBeing.getBirthDate().endsWith(year)) {
                System.out.println(breathingBeing.getBirthDate());
            }
        }
    }

    private static void addPet(List<Birthable> breathingBeings, String[] tokens) {
        String name = tokens[1];
        String birthDay = tokens[2];
        breathingBeings.add(new Pet(name, birthDay));
    }

    private static void addCitizen(List<Birthable> breathingBeings, String[] tokens) {
        String name = tokens[1];
        int age = Integer.parseInt(tokens[2]);
        String id = tokens[3];
        String birthDay = tokens[4];
        breathingBeings.add(new Citizen(name, age, id, birthDay));
    }
}