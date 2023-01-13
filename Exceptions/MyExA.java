package Exceptions;

public class MyExA extends Throwable{
    private final String msg;
    public MyExA(String msg){
        this.msg = msg;
    }

    @Override
    public String toString() {
        return msg;
    }
}
