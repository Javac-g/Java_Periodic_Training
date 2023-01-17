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

    public Map<String, Integer> getIngridients() {
        return ingridients;
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public DrinkReceipt addComponent(String componentName, int componentCount) {
        ingridients.put(componentName,componentCount);
        return this;
    }

    @Override
    public abstract Map<String, Integer> makeDrink();
}
