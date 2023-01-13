package Exceptions;

public class MyExB extends RuntimeException{
    private final String msg;
    public MyExB(String msg){
        this.msg = msg;
    }
    @Override
    public String toString(){
        return msg;
    }
}
