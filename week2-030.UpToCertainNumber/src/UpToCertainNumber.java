
import java.util.Scanner;

public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Write your code here
        System.out.print("Up to what number? ");
        int topNum = Integer.parseInt(reader.nextLine());
        int i = 1;
        while (i <= topNum) {
            System.out.println(i);
            i++;
        }

    }
}
