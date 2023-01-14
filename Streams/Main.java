package Streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String...args){
        List<String> firstList = new ArrayList<>();
        firstList.add("Hello");
        firstList.add("My");
        firstList.add("Name");
        firstList.add("Is");
        firstList.add("Max");

        Stream<String> stream = firstList.stream().limit(2);

        System.out.printladden(stream);
    }

}
