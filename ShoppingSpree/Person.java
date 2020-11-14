package ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException(ConstantMessages.INVALID_MONEY_EXCEPTION_MESSAGE);
        }
        this.money = money;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(ConstantMessages.INVALID_NAME_EXCEPTION_MESSAGE);
        }
        this.name = name;
    }

    public void buyProduct(Product product) {
        if (product.getCost() <= this.money) {
            this.money -= product.getCost();
            System.out.printf("%s bought %s%n",
                    this.name, product.getName());
            products.add(product);
        } else {
            throw new IllegalArgumentException(this.name + " can't afford " + product.getName());
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String productsOutput = this.products.isEmpty()
                ? "Nothing bought"
                : this.products.stream().map(Product::getName)
                .collect(Collectors.joining(", "));
        return this.name + " - " + productsOutput;
    }
}