package Multithreading.Threads;

public class One implements Runnable{
    private final String name;
    private Thread t;
    public One(String name){
        this.name = name;
        t = new Thread(this,name);
        System.out.println("Created: " + this);
        t.start();
    }
    public void run() {
        try {

            for (int i = 9; i > 0; i--) {

                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            System.out.println(name + ": stopped");
        }
    }

}
