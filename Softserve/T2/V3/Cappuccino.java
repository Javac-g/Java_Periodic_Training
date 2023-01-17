package Softserve.T2.V3;

import java.util.Map;

public class Cappuccino extends Coffee {

    public Cappuccino(String name, int count){
        super(name,count);
    }

    @Override
    public Map<String,Integer> makeDrink(){
        addComponent("Robusta",40).addComponent("Milk",50);
        return getIngridients();
    }
}
