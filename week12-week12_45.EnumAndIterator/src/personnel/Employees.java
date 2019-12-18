
package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    
    private List<Person> employees;

    public Employees() {
        employees = new ArrayList<Person>();
    }
    
    public void add(Person person){
        employees.add(person);
    }
    
    public void add(List<Person> persons){
        employees.addAll(persons);
    }
    
    public void print(){
        Iterator<Person> iterator = employees.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education education){
        Iterator<Person> iterator = employees.iterator();
        while(iterator.hasNext()){
            Person currentDude = iterator.next();
            if(currentDude.getEducation() == education){
                System.out.println(currentDude);
           }
        }
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = employees.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getEducation() == education){
                iterator.remove();
           }
        }
    }
    
    
    
}
