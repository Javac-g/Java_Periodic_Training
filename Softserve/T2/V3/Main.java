package Softserve.T2.V3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public Map<String,Double> averageRating(List<Coffee> coffies){
        return coffies.stream().collect(Collectors.groupingBy(Coffee::getName,Collectors.averagingDouble(Coffee::getRating)));
    }
}
