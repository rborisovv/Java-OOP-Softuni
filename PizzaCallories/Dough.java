package PizzaCallories;

import java.util.Map;

public class Dough {

    private static final Map<String, Double> FLOUR_TYPES_WITH_MODIFIERS =
            Map.of("White", 1.5,
                    "Wholegrain", 1.0);
    private static final Map<String, Double> TECHNIQUES_TYPES_WITH_MODIFIERS =
            Map.of("Crispy", 0.9,
                    "Chewy", 1.1,
                    "Homemade", 1.0);

    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (!TECHNIQUES_TYPES_WITH_MODIFIERS.containsKey(bakingTechnique)) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique;
    }

    private void setFlourType(String flourType) {
        if (!FLOUR_TYPES_WITH_MODIFIERS.containsKey(flourType)) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    public double calculateCalories() {
        return (2 * this.weight) *
                TECHNIQUES_TYPES_WITH_MODIFIERS.get(bakingTechnique) *
                FLOUR_TYPES_WITH_MODIFIERS.get(flourType);
    }
}