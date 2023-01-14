package Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Ex1 {
    public static void main(String...args){
        List<Dish> dishes = new ArrayList<>();

        dishes.add(new Dish(100,"Fish"));
        dishes.add(new Dish(200,"Mushrooms"));
        dishes.add(new Dish(300,"Meat"));
        dishes.add(new Dish(400,"Potato"));
        dishes.add(new Dish(500, "Deer"));
        dishes.add(new Dish(600,"Borsch"));
        dishes.add(new Dish(700,"Chicken"));
        dishes.add(new Dish(800, "Duck"));

        List<Dish> lowCalories = new ArrayList<>();
        for(Dish d:dishes){
            if (d.getCalories() < 500){
                lowCalories.add(d);
            }
        }
        Collections.sort(lowCalories, new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                return Integer.compare(o1.getCalories(),o2.getCalories());
            }
        });

        List<String>lowCaloriesDishes = new ArrayList<>();
        for (Dish d:lowCalories){
            lowCaloriesDishes.add(d.getName());
        }
        System.out.println(lowCaloriesDishes);
        //Thats what was before java 7
        //Here streams version

        List<String> lowCalDish = dishes.stream()
                .filter(d ->d.getCalories() < 500)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName).collect(toList());
        System.out.println(lowCalDish);
    }

}
