
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Airport airport = new Airport();
        Scanner reader = new Scanner(System.in);
        AirportPanel airportPanel = new AirportPanel(airport, reader);
        airportPanel.start();
        FlightService fs = new FlightService(airport, reader);
        fs.start();
    }
}
