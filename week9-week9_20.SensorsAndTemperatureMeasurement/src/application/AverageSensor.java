
package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    
    private List<Sensor> sensorList;
    private List<Integer> readings;

    public AverageSensor() {
        sensorList = new ArrayList<Sensor>();
        readings = new ArrayList<Integer>();
    }
    
    
    public void addSensor(Sensor newSensor){
        sensorList.add(newSensor);
    }
    
    public List<Integer> readings(){
        return readings;
    }
    

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensorList) {
            if(sensor.isOn() == false){
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor sensor : sensorList) {
            sensor.on();
        }
    }

    @Override
    public void off() {
        for (Sensor sensor : sensorList) {
            sensor.off();
        }
    }

    @Override
    public int measure() {
        if(isOn() == false || sensorList.isEmpty()){
            throw new IllegalStateException("The average sensor isn't on, or there are no sensors for the average sensor to measure from!");
        }
        
        int sum = 0;
        for (Sensor sensor : sensorList) {
            sum += sensor.measure();
        }
        int finalMeasurement = sum/sensorList.size();
        readings.add(finalMeasurement);
        return finalMeasurement;
    }
    
    
    
}
