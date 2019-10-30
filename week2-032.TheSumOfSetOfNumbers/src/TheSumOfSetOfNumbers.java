
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int topNum = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        int i = 1;
        while(i <= topNum){
            sum += i;
            i++;
        }
        System.out.println(sum);
        
    }
}
