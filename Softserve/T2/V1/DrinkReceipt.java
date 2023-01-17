package Softserve.T2.V1;

public interface DrinkReceipt {
    String getName();
    DrinkReceipt addComponent(String componentName, int componentCount);
}
