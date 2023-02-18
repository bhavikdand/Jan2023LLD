package design_patterns.decorator;

public class ChocoChips extends IngredientDecorator{

    public ChocoChips(Ingredient baseIngredient){
        super(baseIngredient);
    }

    @Override
    public float getCost() {
        return baseIngredient.getCost() + 25;
    }

    @Override
    public String getDescription() {
        return baseIngredient.getDescription() + ", Choco chips";
    }


}
