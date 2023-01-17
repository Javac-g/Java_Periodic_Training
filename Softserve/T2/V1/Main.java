package Softserve.T2.V1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public Map<String,Double> averageRating(List<Caffee> caffees){
        return caffees.stream()
                .collect(Collectors.groupingBy(Caffee::getName,Collectors.averagingDouble(Caffee::getRating)));
    }
}
