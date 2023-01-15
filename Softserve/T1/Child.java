package Softserve.T1;

public class Child extends Person{

    public Child(String name, String healthInfo, int age,int childId) {
        super(name, healthInfo, age);
        this.childId = childId;
    }
    public String getHelthInfo(){
        return healthInfo;
    }
}
