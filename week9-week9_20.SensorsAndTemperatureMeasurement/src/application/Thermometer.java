
package application;

import java.util.Random;

public class Thermometer implements Sensor {
    
    private boolean isOn;

    public Thermometer() {
        isOn = false;
    }
    
    

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void on() {
        isOn = true;
    }

    @Override
    public void off() {
        isOn = false;
    }

    @Override
    public int measure() {
        if(isOn){
            Random random = new Random();
            return (int) random.nextInt(30 + 30) - 30; 
        }
        throw new IllegalStateException("The thermometer is off.");
    }
    
}
