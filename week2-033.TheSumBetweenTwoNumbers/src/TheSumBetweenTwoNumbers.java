
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("First: ");
        int lowerBound = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int upperBound = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        while(lowerBound <= upperBound){
            sum = sum + lowerBound;
            lowerBound++;
        }
        
        System.out.println("The sum is " + sum);
        
    }
}
