package Softserve.T2;

import java.util.Map;

public class Espresso extends Caffee{

    public Espresso(String name, int rating) {
        super(name, rating);
    }

    @Override
    public Map<String, Integer> makeDrink() {
        addComponent("Water",50)
       .addComponent("Arabica",20);
        return getIngredients();
    }
}
