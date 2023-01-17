package Softserve.T2.V3;

import java.util.Map;

public class Espresso extends Coffee{

    public Espresso(String name, int rating){
        super(name,rating);
    }

    @Override
    public Map<String, Integer> makeDrink() {
        addComponent("Arabica",100).addComponent("Water",50);
        return getIngridients();
    }
}
