package Softserve.T2.V2;

import java.util.HashMap;
import java.util.Map;

public abstract class Coffee implements DrinkReceipt,DrinkPreparation,Rating {
    protected String name;
    protected int rating;
    protected Map<String,Integer> ingridients = new HashMap<>();

    public Coffee(String name, int rating) {
        this.name = name;
        this.rating = rating;

    }

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public abstract DrinkReceipt addComponent(String componentName, int componentCount);

    @Override
    public abstract Map<String, Integer> makeDrink();
}
