package design_patterns.decorator;

public class ChocoCone implements Ingredient {
    @Override
    public float getCost() {
        return 30;
    }

    @Override
    public String getDescription() {
        return "Chocolate cone";
    }
}
