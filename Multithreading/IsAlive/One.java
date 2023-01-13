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

    public String getName() {
        return name;
    }

    public Thread getT() {
        return t;
    }

    @Override
    public void run(){

            try {
                for (int i = 5;i > 0;i--){
                    System.out.println(name + ": " + i);
                    Thread.sleep(1000);
                }

            }catch (InterruptedException e){
                e.printStackTrace();
            }finally {
                System.out.println(name + ": finished");
            }

    }
}
