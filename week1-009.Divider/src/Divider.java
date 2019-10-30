
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int num2 = Integer.parseInt(reader.nextLine());
        
        System.out.println("");
        
        System.out.println("Division: " + num1 + " / " + num2 + " = " + ((double)num1 / num2));
    }
}
