
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        BirdDatabase birdDatabase = new BirdDatabase();
        String input;
        while (true){
            System.out.print("? ");
            input = reader.nextLine();
            if(input.equals("Add")){
                System.out.print("Name: ");
                String name = reader.nextLine();
                System.out.print("Latin Name: ");
                birdDatabase.add(name, reader.nextLine());    
            }else if(input.equals("Observation")){
                System.out.print("What was observed:? ");
                birdDatabase.observed(reader.nextLine());
            }else if(input.equals("Statistics")){
                birdDatabase.printStatistics();
            }else if(input.equals("Show")){
                System.out.print("What? ");
                birdDatabase.show(reader.nextLine());
            }else if(input.equals("Quit")){
                break;
            }
            
        }

    }

}
