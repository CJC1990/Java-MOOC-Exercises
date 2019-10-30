
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.print("First: ");
        int firstNum = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int secondNum = Integer.parseInt(reader.nextLine());
        
        while (firstNum <= secondNum){
            System.out.println(firstNum);
            firstNum++;
        }

    }
}
