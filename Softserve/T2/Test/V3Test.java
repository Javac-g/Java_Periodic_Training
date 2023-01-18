package Softserve.T2.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class V3Test {
    private final static String PATH = "Softserve.T2.V3.";
    @ParameterizedTest
    @MethodSource("listOfClasses")
    @DisplayName("Is class present ?")
    public void isClassPresent(String c){
        try{
            Assertions.assertNotNull(Class.forName(PATH+c));
            Assertions.assertEquals(c,Class.forName(PATH+c).getSimpleName());
        }catch (ClassNotFoundException e){
            Assertions.fail("Class not found: " + c);
        }
    }

    private static Stream<Arguments> listOfClasses(){
        return Stream.of(
                Arguments.of("Coffee"),
                Arguments.of("Cappuccino"),
                Arguments.of("Espresso"),
                Arguments.of("DrinkReceipt"),
                Arguments.of("DrinkPreparation"),
                Arguments.of("Rating"),
                Arguments.of("Main")

                );
    }
}
