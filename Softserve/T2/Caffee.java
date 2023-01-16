package Softserve.T2;

import java.util.HashMap;
import java.util.Map;

public class Caffee implements DrinkReceipt, DrinkPreparation,Rating{
    private String name;
    private int rating;
    private  Map<String,Integer> ingredients = new HashMap<>();

    public Caffee(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public Map<String, Integer> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Map<String, Integer> ingredients) {
        this.ingredients = ingredients;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public DrinkReceipt addComponent(String componentName, int componentCount) {
        ingredients.put(componentName,componentCount);
        return this;
    }

    @Override
    public Map<String, Integer> makeDrink() {
        addComponent("Water",100)
       .addComponent("Arabica",20);
        return ingredients;
    }
}
