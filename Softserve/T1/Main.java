package Softserve.T1;

public class Main {
    public static void main(String...args){
        Child mark = new Child("Max","Strong health",14,1924);
        Adult vlad = new Adult("Vlad","Weak health",39,98321);

        System.out.println("Mark has: " + mark.getHealthInfo());
        System.out.println("Vlad has: " + vlad.getHealthInfo());
    }
}
