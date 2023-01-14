package Exceptions;

public class Main {
    public static void myMethod() throws MyExA,MyExB{
        for (int i = 5; i > 0;i--){
            if (i ==2){
                throw new MyExB("Got point: " +  i);
            }

            System.out.println("Point: " + i);
        }
    }
    public static void main(String...args) throws MyExA {
        try{
            myMethod();
        }catch (MyExA e){
            myMethod();
        }
    }
}
