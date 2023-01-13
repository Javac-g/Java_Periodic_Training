package Multithreading.IsAlive;

public class One implements Runnable{
    private final String name;
    Thread t;

    public One(String name) {
        this.name = name;
        t = new Thread(this);
        System.out.println(name + ": created");
        t.start();
    }

    @Override
    public void run(){
        for (int i = 5; i > 0 ; i--){
            try {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }finally {
                System.out.println(name + ": finished");
            }
        }
    }
}
