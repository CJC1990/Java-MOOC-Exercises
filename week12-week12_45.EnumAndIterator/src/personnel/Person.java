
package personnel;

public class Person {
    
    private String name;
    private Education education;

    public Person(String name, Education title) {
        this.name = name;
        this.education = title;
    }
    
    public Education getEducation(){
        return education;
    }

    @Override
    public String toString() {
        return name + ", " + education;
    }
    
    
    
    

}
