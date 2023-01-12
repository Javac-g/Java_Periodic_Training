package Multithreading.Synchro;

public class Call {
    public void calling(String msg){

        try{
            System.out.print("[" + msg);
            Thread.sleep(1000);

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("]");
    }
}
