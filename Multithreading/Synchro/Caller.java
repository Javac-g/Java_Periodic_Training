package Multithreading.Synchro;

public class Caller implements Runnable{
    Thread t;
    String msg;
    Call target;

    public Caller(Call target,String msg){
        this.target = target;
        this.msg = msg;

        t = new Thread(this);
        t.start();
    }
    public void run(){

           target.calling(msg);
    }
}
