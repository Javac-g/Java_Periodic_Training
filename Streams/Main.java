package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String...args){
        List<String> firstList = new ArrayList<>();
        firstList.add("Hello");
        firstList.add("My");
        firstList.add("Name");
        firstList.add("Is");
        firstList.add("Max");

        Stream<String> stream = firstList.stream().map(x -> x.replaceAll("e","")).limit(4);
        List<String> second = stream.collect(toList());
        System.out.println(second);
    }

}
