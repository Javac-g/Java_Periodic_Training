package Softserve.T1;

public class Adult extends Person{

    public Adult(String name,String healthInfo,int age,int passportNumber){
        super(name,healthInfo,age);
        this.passportNumber = passportNumber;
    }

    @Override
    public String getHealthInfo(){
        return healthInfo;
    }
}
