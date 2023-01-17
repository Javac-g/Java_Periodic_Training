package Softserve.T2.V2;

import java.util.HashMap;
import java.util.Map;

public class Coffee {
    protected String name;
    protected int rating;
    protected Map<String,Integer> ingridients = new HashMap<>();

    public Coffee(String name, int rating) {
        this.name = name;
        this.rating = rating;

    }

}
