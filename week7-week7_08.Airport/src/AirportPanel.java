
import java.util.Scanner;

public class AirportPanel{
    
    private Airport airport;
    private Scanner reader;

    public AirportPanel(Airport airport, Scanner reader) {
        this.airport = airport;
        this.reader = reader;
        System.out.println("Airport panel");
        System.out.println("--------------------\n");
    }
    
    public void start(){
        printMenu();
    }
    
    public void printMenu(){
        while(true){
            System.out.println("Choose operation:\n" +
                           "[1] Add airplane\n" +
                           "[2] Add flight\n" +
                           "[x] Exit");
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
             addPlane(reader);
         }else if(input.equals("2")){
            addFlight(reader); 
         }  
    }
    
    public void addPlane(Scanner reader){
        System.out.print("Give plane ID:");
        String planeID = reader.nextLine();
        System.out.print("Give plane capacity: ");
        int planeCapacity = Integer.parseInt(reader.nextLine());
        airport.addPlane(planeID, planeCapacity);
    }
    
    public void addFlight(Scanner reader){
        System.out.print("Give plane ID:");
        String planeID = reader.nextLine();
        System.out.print("Give departure airport code: ");
        String dep = reader.nextLine();
        System.out.print("Give destination airport code: ");
        String arr = reader.nextLine();
        Plane plane = airport.getPlane(planeID);
        airport.addFlight(plane, dep, arr);
    }
          
}
