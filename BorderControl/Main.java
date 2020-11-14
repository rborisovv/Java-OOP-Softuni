package BorderControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        int numberOfPeople = Integer.parseInt(reader.readLine());

        List<Person> buyers = new ArrayList<>();
        for (int currentPerson = 0; currentPerson < numberOfPeople; currentPerson++) {
            String[] tokens = reader.readLine().split("\\s+");

            if (tokens.length == 4) {
                addCitizen(tokens, buyers);
            } else if (tokens.length == 3) {
                addRebel(tokens, buyers);
            }
        }
        String name = reader.readLine();
        while (!name.equals("End")) {
            for (Person buyer : buyers) {
                if (buyer.getName().equals(name)) {
                    buyer.buyFood();
                }
            }
            name = reader.readLine();
        }
        System.out.println(buyers.stream().mapToInt(Buyer::getFood)
                .sum());
    }

    private static void addRebel(String[] tokens, List<Person> buyers) {
        String name = tokens[0];
        int age = Integer.parseInt(tokens[1]);
        String group = tokens[2];

        buyers.add(new Rebel(name, age, group));
    }

    private static void addCitizen(String[] tokens, List<Person> buyers) {
        String name = tokens[0];
        int age = Integer.parseInt(tokens[1]);
        String id = tokens[2];
        String birthDay = tokens[3];

        buyers.add(new Citizen(name, age, id, birthDay));
    }
}