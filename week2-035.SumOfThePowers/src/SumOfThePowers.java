
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int topPower = Integer.parseInt(reader.nextLine());
        
        int answer = 0;
        int i = 0;
        
        while(i <= topPower){
            answer += (int)Math.pow(2, i);
            i++;
        }
        
        System.out.println("The result is " + answer);

    }
}
