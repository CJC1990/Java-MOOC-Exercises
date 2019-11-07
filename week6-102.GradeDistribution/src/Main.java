
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Grades grades = new Grades();

        System.out.println("Type exam scores, -1 completes:");

        while (true) {

            int inputScore = Integer.parseInt(reader.nextLine());
            if (inputScore == -1) {
                break;
            }
            if(inputScore < -1 || inputScore > 60){
                continue;
            }
            grades.convertScore(inputScore);
        }
        grades.printGrade();
        grades.printAccepted();
    }
}
