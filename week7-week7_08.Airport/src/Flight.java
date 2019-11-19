public class Flight {
    
    private Plane plane;
    private String departure;
    private String destination;

    public Flight(Plane plane, String departure, String destination) {
        this.plane = plane;
        this.departure = departure;
        this.destination = destination;
    }

    public String getDeparture() {
        return departure;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public String toString() {
        return plane.toString() + " (" + departure + "-" + destination + ")";
    }
    
    
    
}
