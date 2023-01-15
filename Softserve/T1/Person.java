package Softserve.T1;

public class Person {
    protected String name;
    protected String healthInfo;
    protected int childId,age,passportNumber;

    public Person(String name, String healthInfo, int age) {
        this.name = name;
        this.healthInfo = healthInfo;
        this.age = age;
    }

    public Person(String name, String healthInfo, int age, int passportNumber) {
        this.name = name;
        this.healthInfo = healthInfo;
        this.age = age;
        this.passportNumber = passportNumber;
    }
}
