
import java.util.ArrayList;

public class Grades {

    // ---CLASS VARIABLES--- 
    private int[] grades = {0, 0, 0, 0, 0, 0};
    private int accepted;
    private int allScores;

    // ---CONSTRUCTOR---
    public Grades() {
        this.accepted = 0;
        this.allScores = 0;
    }

    // ---METHODS---
    public void convertScore(int score) {
        if (score >= 0 && score <= 29) {
            addGrade(0);
            allScores++;
        } else if (score <= 34) {
            addGrade(1);
            accepted++;
            allScores++;
        } else if (score <= 39) {
            addGrade(2);
            accepted++;
            allScores++;
        } else if (score <= 44) {
            addGrade(3);
            accepted++;
            allScores++;
        } else if (score <= 49) {
            addGrade(4);
            accepted++;
            allScores++;
        } else if (score <= 60) {
            addGrade(5);
            accepted++;
            allScores++;
        }
    }

    public void addGrade(int gradeIndex) {
        grades[gradeIndex] += 1;
    }

    public void printGrade() {
        System.out.println("Grade distribution:");
        for (int i = 5; i > -1; i--) {
            System.out.print(i + ": ");
            printStars(grades[i]);
            System.out.println("");
        }
    }

    public void printStars(int numOfStars) {
        for (int i = 0; i < numOfStars; i++) {
            System.out.print("*");
        }
    }

    public void printAccepted() {
        System.out.println("Acceptance percentage: " + 100 * this.accepted / (double) allScores);
    }

}
