
package farmsimulator;

import java.util.Random;

public class Cow implements Milkable, Alive{
    
    private String name;
    private double udderCapacity;
    private double amountOfMilk;
    
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow(String name) {
        this.name = name;
        udderCapacity = 15 + new Random().nextInt(26);
    }
    
    public Cow(){
        this(NAMES[new Random().nextInt(NAMES.length)]); 
    }

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return udderCapacity;
    }

    public double getAmount() {
        return amountOfMilk;
    }
    
    @Override
    public double milk() {
        double amountMilked = amountOfMilk;
        amountOfMilk = 0;
        return amountMilked;
    }
    
    @Override
    public void liveHour() {
        double randomAmount = 0.7 + (2.0 - 0.7) * new Random().nextDouble();
        if(amountOfMilk + randomAmount > udderCapacity){
            amountOfMilk = udderCapacity;
        }else{
            amountOfMilk += randomAmount;
        }
    }
    
    @Override
    public String toString() {
        return name + " " + Math.ceil(amountOfMilk) + "/" + Math.ceil(udderCapacity);
    }

    
    
    
    
    
    
}
