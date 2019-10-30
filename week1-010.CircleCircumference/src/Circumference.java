
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the radius: ");
        int radius = Integer.parseInt(reader.nextLine());
        
        double circum = Math.PI * 2 * radius;
        
        System.out.println("");
        
        System.out.println("Circumference of the circle: " + circum);
    }
}
