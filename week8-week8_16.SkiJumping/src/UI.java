
import java.util.Collections;
import java.util.Scanner;

public class UI {

    Scanner reader;
    Round round;

    public UI() {
        this.reader = new Scanner(System.in);
        round = new Round();
    }

    public void start() {
        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        addParticipants();
        handleInput();
    }

    public void addParticipants() {
        while (true) {
            System.out.print("  Participant name: ");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            round.addJumper(name);
        }
        System.out.println("\nThe tournament begins!");
    }

    public void handleInput() {

        while (true) {
            System.out.print("\nWrite \"jump\" to jump; otherwise you quit: ");
            String input = reader.nextLine();
            if (input.equals("quit")) {
                Collections.sort(round.jumpers);
                Collections.reverse(round.jumpers);
                printTourneyResults();
                break;
            } else if (input.equals("jump")) {
                Collections.sort(round.jumpers);
                printJumpingOrder();
                round.nextRound();
                printRoundResults();
            }
        }

    }
    
    public void printJumpingOrder(){
        System.out.println("\nRound " + round.roundNumber + "\n");
        System.out.println("Jumping order:");
        
        for(int i=0; i<round.jumpers.size(); i++){
            System.out.println("  " + (i+1) + ". " + round.jumpers.get(i));
        }
        System.out.println("\nResults of round " + round.roundNumber);
    }
    
    public void printRoundResults(){
        for (Jumper jumper : round.jumpers) {
            System.out.println("  " + jumper.getName());
            System.out.println("    " + "length: " + jumper.getLastJumpDistance());
            System.out.println("    " + "judge votes: " + jumper.getJudgeScores());
        }
    }
    
    private void printTourneyResults(){
        System.out.println("\nThanks!\n");
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        
        for(int i=0; i<round.jumpers.size(); i++){
            System.out.println( (i+1) + "           " + round.jumpers.get(i));
            System.out.print("            " + "jump lengths: ");
            
            System.out.print(round.jumpers.get(i).getRoundJumpDistance(0) + " m");
            for(int k=1; k<round.jumpers.get(i).getDistances().size(); k++){
                System.out.print(", " + round.jumpers.get(i).getRoundJumpDistance(k) + " m" );
            }
            System.out.println("");
        }
        
    }

}
