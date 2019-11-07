public class Bird {
    
    // ---CLASS VARIABLES---
    private String name;
    private String latinName;
    private int observations;
    
    // ---CONSTRUCTOR---
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }
    
    // ---METHODS---
    public void sighted(){
        this.observations++;
    }

    public String getName() {
        return name;
    }
    
    

    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observations + " observations";
    }
    
    
    
    
}
