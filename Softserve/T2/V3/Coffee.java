package Softserve.T2.V3;

import java.util.HashMap;
import java.util.Map;

public abstract class Coffee implements DrinkReceipt,DrinkPreparation,Rating {
    protected String name;
    protected int rating;
    protected Map<String, Integer> ingridients = new HashMap<>();

    public Coffee(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }
    public Map<String, Integer> getIngridients() {
        return ingridients;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRating() {
        return rating;
    }


    @Override
    public  DrinkReceipt addComponent(String name,int count){
        ingridients.put(name,count);
        return this;
    }
    public abstract Map<String,Integer> makeDrink();

}
