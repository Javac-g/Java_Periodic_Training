package Multithreading.Synchro;

public class Caller implements Runnable{
    Thread t;
    String msg;
    final Call target;

    public Caller(Call target,String msg){
        this.target = target;
        this.msg = msg;

        t = new Thread(this);
        t.start();
    }
    public void run(){

           synchronized (target){
               target.calling(msg);
           }
    }
}
