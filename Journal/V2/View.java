package Journal.V2;

import java.util.Scanner;

public class View {
    private final static Scanner scanner = new Scanner(System.in);

    public void printMessage(String msg){
        System.out.println(msg);
    }
    public void printData(Student student){
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.println("Salary: " + student.getSalary());
    }
    public void printMenu(){
        System.out.println("---   M E N U   ---");
        System.out.println("1 - Add student");
        System.out.println("2 - Find student");
        System.out.println("3 - Update student");
        System.out.println("4 - Delete student");
        System.out.println("5 - Exit");
    }
    public String addString(String msg){

        System.out.println(msg);

        return scanner.next();
    }
    public Integer addInteger(String msg){
        System.out.println(msg);

        return scanner.nextInt();
    }
}
