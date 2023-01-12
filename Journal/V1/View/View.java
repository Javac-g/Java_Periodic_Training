package Journal.V1.View;

import Journal.V1.Model.Person;

import java.util.Scanner;

public class View {
    private final static Scanner scanner = new Scanner(System.in);

    public void printMenu(){
        System.out.println("- - - - - C H O O S E - - - - -");
        System.out.println("1 - Add person");
        System.out.println("2 - Find person");
        System.out.println("3 - Update person");
        System.out.println("4 - Delete person");
        System.out.println("5 - Exit");
    }
    public void printMSG(String msg){
        System.out.println(msg);
    }
    public String getString(String msg){
        System.out.println(msg);
        return scanner.next();
    }
    public int getNumb(String msg){
        System.out.println(msg);
        return scanner.nextInt();
    }
    public void printData(Person person){
        System.out.println("Name: " + person.getName());
        System.out.println("Position: " + person.getPosition());
        System.out.println("Salary: " + person.getSalary());
    }
}
