
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a year: ");

        int year = Integer.parseInt(reader.nextLine());
        boolean flag;
        if (year % 400 == 0) {
            flag = true;
        } else if (year % 100 == 0) {
            flag = false;
        } else if (year % 4 == 0) {
            flag = true;
        } else {
            flag = false;
        }

        if (flag) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");

        }

    }
}
