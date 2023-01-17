package Softserve.T2.V3;

public interface DrinkReceipt {
    String  getName();
    DrinkReceipt addComponent(String name, int count);
}
