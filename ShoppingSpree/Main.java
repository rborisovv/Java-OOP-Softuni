package ShoppingSpree;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        List<Person> people =
                Arrays.stream(scanner.nextLine()
                        .split(";"))
                        .map(personInfo -> {
                            String[] tokens = personInfo.split("=");
                            try {
                                return new Person(tokens[0], Double.parseDouble(tokens[1]));
                            } catch (IllegalArgumentException e) {
                                System.out.println(e.getMessage());
                            }
                            return null;
                        }).collect(Collectors.toList());
        List<Product> products =
                Arrays.stream(scanner.nextLine()
                .split(";"))
                .map(productInfo -> {
                    String[] tokens = productInfo.split("=");
                    try {
                        return new Product(tokens[0], Double.parseDouble(tokens[1]));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    return null;
                }).collect(Collectors.toList());
        if (people.stream().anyMatch(Objects::isNull) ||
                products.stream().anyMatch(Objects::isNull)) {
            return;
        }
        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String name = command.split("\\s+")[0];
            String product = command.split("\\s+")[1];

            for (Person person : people) {
                if (person.getName().equals(name)) {
                    try {
                        Product productToBeBought = products
                                .stream()
                                .filter(pr -> pr.getName().equals(product))
                                .findFirst()
                                .orElseThrow(Exception::new);
                        person.buyProduct(productToBeBought);
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}