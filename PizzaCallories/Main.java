package PizzaCallories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizzaTokens = scanner.nextLine().split("\\s+");

        String pizzaName = pizzaTokens[1];
        int numberOfToppings = Integer.parseInt(pizzaTokens[2]);
        try {
            Pizza pizza = new Pizza(pizzaName, numberOfToppings);

            String[] doughTokens = scanner.nextLine().split("\\s+");
            String flourType = doughTokens[1];
            String bakingTechnique = doughTokens[2];
            double doughWeight = Double.parseDouble(doughTokens[3]);
            Dough dough = new Dough(flourType, bakingTechnique, doughWeight);
            pizza.setDough(dough);

            String input = scanner.nextLine();
            while (!input.equals("END")) {
                String[] toppingTokens = input.split("\\s+");
                pizza.addTopping(new Topping(toppingTokens[1], Double.parseDouble(toppingTokens[2])));
                input = scanner.nextLine();
            }
            System.out.println(pizza.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}