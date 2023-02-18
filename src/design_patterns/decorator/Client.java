package design_patterns.decorator;

public class Client {

    public static void main(String[] args) {

        Ingredient iceCream = new ChocoChips(new ChocoSyrup(new ChocoCone()));

        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDescription());
    }
}
