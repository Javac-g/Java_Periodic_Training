package Journal.V1.Model;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private final List<Person> personList = new ArrayList<>();


    public void addPerson(String name,String position,Integer salary,Integer id){
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setPosition(position);
        person.setSalary(salary);
        personList.add(person);
    }
    public Person findPerson(Integer id){
        for (Person person:personList){
            if (person.getId() == id){
                return person;
            }
        }
        return null;
    }
    public Person updatePerson(Integer lookedID,String name,String position,int salary,Integer id){
        Person person = findPerson(lookedID);
        if (person != null){
            person.setId(id);
            person.setSalary(salary);
            person.setPosition(position);
            person.setName(name);
            return person;
        }
        return null;
    }
    public Integer delete(Integer id){
        int index = -1;
        for (int i  = 0; i < personList.size();i++){
            if (personList.get(i).getId() == id){
                index = i;
            }
        }
        if (index != -1){
            personList.remove(index);
            return index;
        }
        return null;
    }
}
