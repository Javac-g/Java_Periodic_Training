package Multithreading.Threads;

public class Two extends Thread{
    private final String name;
    public Two(String name){
        super(name);
        this.name = name;
        System.out.println("Created: " + this);
        start();
    }
    public void run(){
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
