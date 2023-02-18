package design_patterns.decorator;

public class ChocoSyrup extends IngredientDecorator{

    public ChocoSyrup(Ingredient baseIngredient){
        super(baseIngredient);
    }
    @Override
    public float getCost() {
        return baseIngredient.getCost() + 15;
    }

    @Override
    public String getDescription() {
        return baseIngredient.getDescription() + ", Choco syrup";
    }
}
