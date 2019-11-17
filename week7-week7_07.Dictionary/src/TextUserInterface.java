
import java.util.Scanner;

public class TextUserInterface {
    
    private Dictionary dictionary;
    private Scanner reader;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.dictionary = dictionary;
        this.reader = reader;
    }
    
    public void start(){
        
        printMenu();
        
        while(true){
            System.out.println("");
            String input = getInput();
            if(input.equals("quit")){
                break;
            }else if(input.equals("add")){
                add();
            }else if(input.equals("translate")){
                translate();
            }else{
                System.out.println("Unknown statement");
            }
            
        }
        
        System.out.println("Cheers!");
        
    }
    
    private void printMenu(){
        System.out.println("Statement:");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quit the text user interface");
    }
    
    private String getInput(){
        System.out.print("Statement: ");
        return reader.nextLine();
    }
    
    private void add(){
        System.out.print("In Finnish: ");
        String fin = reader.nextLine();
        System.out.print("Translation: ");
        this.dictionary.add(fin, reader.nextLine());
    }
    
    private void translate(){
        System.out.print("Give a word: ");
        System.out.println("Translation: " + this.dictionary.translate(reader.nextLine()));
    }
    
    
    
    
    
}
