
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class VehicleRegister {
    
    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        owners = new HashMap<RegistrationPlate, String>();
    }
    
    public boolean add(RegistrationPlate plate, String owner){
        if(!owners.containsKey(plate)){
            owners.put(plate, owner);
            return true;
        }
        return false;
    }
    
    public String get(RegistrationPlate plate){
        if(owners.containsKey(plate)){
            return owners.get(plate);
        }
        return null;
    }
    
    public boolean delete(RegistrationPlate plate){
        if(owners.containsKey(plate)){
            owners.remove(plate);
            return true;
        }
        return false;
    }
    
    public void printRegistrationPlates(){
        for (RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }
    
    public void printOwners(){
        ArrayList<String> ownersOnce = new ArrayList<String>();
        for (String owner : owners.values()) {
            if(!ownersOnce.contains(owner)){
                ownersOnce.add(owner);
            }
        }
        for (String owner : ownersOnce) {
            System.out.println(owner);
        }
    }
    
}
