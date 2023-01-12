package Journal.V2;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private final List<Student> students = new ArrayList<>();

    public void add(int id,String name,int salary){
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setSalary(salary);
        students.add(student);
    }
    public Student find(Integer id){

           for (Student x: students){
                if(x.getId().equals(id)){
                    return x;
                }
           }
           return null;
    }
    public Student update(Integer id,Integer Nid,String Name,Integer salary){
        Student updated = find(id);
        if (updated != null){
            updated.setId(Nid);
            updated.setSalary(salary);
            updated.setName(Name);
            return updated;
        }
        return null;
    }
    public Integer delete(Integer id){
        int index = -1;
        for (int i = 0; i < students.size();i++){
            if (students.get(i).getId().equals(id)){
                index = i;
            }
        }
        if (index != -1){
            students.remove(index);
            return index;
        }
        return null;
    }


}
