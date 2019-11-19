
import java.util.ArrayList;

public class Airport {
    
    private ArrayList<Plane> planes;
    private ArrayList<Flight> flights;

    public Airport() {
        planes = new ArrayList<Plane>();
        flights = new ArrayList<Flight>();
        
    }
    
    public void addPlane(String planeId, int capacity){
        planes.add(new Plane(planeId, capacity));
    }
    
    public Plane getPlane(String id){
        for (Plane plane : planes) {
            if(plane.getId().equals(id)){
                return plane;
            }
        }
        return null;
    }
    
    public void addFlight(Plane plane, String departure, String destination){
        Flight newFlight = new Flight(plane, departure, destination);
        flights.add(newFlight);
    }

    public void printFlights(){
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }
    
    public void printPlanes(){
        for (Plane plane : planes) {
            System.out.println(plane);
        }
    }
    
    
    
    
    
    
    
}
