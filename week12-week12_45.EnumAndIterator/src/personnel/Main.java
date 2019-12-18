package personnel;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write test code here
        Person arto = new Person("Arto", Education.D);
        Person chandler = new Person("chandler", Education.M);
        Person caleb = new Person("caleb", Education.B);
        Person john = new Person("john", Education.GRAD);
        Person rick = new Person("rick", Education.D);
        
        List<Person> people = new ArrayList<Person>();
        people.add(arto);
        people.add(chandler);
        people.add(caleb);
        people.add(john);
        people.add(rick);
        
        Employees employees = new Employees();
        
        employees.add(people);
        
        employees.print(Education.D);
    
    }
}
