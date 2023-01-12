package Multithreading.Synchro;

public class Main {
    public static void main(String...args){
        Call call = new Call();
        Caller A = new Caller(call,"Welcome");
        Caller B = new Caller(call,"to synchronized,");
        Caller C = new Caller(call,"world");
    }
}
