import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        for(int i=name.length()-1; i>-1; i--){
            System.out.print(name.charAt(i));
        }
    }
}
