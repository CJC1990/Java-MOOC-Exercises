package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age){
        if(name == null || name.isEmpty() || name.length() > 40 || age < 0 || age >120){
            throw new IllegalArgumentException("Name is empty, longer than 40 chars, or age is out of range.");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
