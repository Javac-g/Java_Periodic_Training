package Multithreading.IsAlive;

public class Two extends Thread {

    private final String name;

    public Two(String name){
        super(name);
        this.name = name;
        System.out.println(name + ": created");
        start();
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
