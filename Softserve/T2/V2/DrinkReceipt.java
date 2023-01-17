package Softserve.T2.V2;

public interface DrinkReceipt {
    String getName();
    DrinkReceipt addComponent(String componentName,int componentCount);
}
