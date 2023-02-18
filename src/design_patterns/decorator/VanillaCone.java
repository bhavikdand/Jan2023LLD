package design_patterns.decorator;

public class VanillaCone implements Ingredient {
    @Override
    public float getCost() {
        return 30;
    }

    @Override
    public String getDescription() {
        return "Vanilla cone";
    }
}
