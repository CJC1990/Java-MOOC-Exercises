
import java.util.Scanner;

public class FlightService {
    
    private Airport airport;
    private Scanner reader;

    public FlightService(Airport airport, Scanner reader) {
        this.airport = airport;
        this.reader = reader;
        System.out.println("\nFlight service\n" +
                           "------------\n");
    }
    
    public void start(){
        printMenu();
    }
    
    public void printMenu(){
        while(true){
            System.out.println("Choose operation:\n" +
                           "[1] Print planes\n" +
                           "[2] Print flights\n" +
                           "[3] Print plane info\n" +
                           "[x] Quit");
        System.out.print("> ");
        String input = reader.nextLine();
        if(input.equals("x")){
            break;
        }
        handleInput(input);
        }
    }
    
    public void handleInput(String input){
         if(input.equals("1")){
            airport.printPlanes();
         }else if(input.equals("2")){
            airport.printFlights();
         }else if(input.equals("3")){
             System.out.print("Give plane ID:");
             System.out.println(airport.getPlane(reader.nextLine()));
         }
    }
    
    
    
    
    
    
    
}
