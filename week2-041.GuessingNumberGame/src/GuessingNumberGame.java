
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guessedNumber;
        int numberOfGuesses = 0;

        // program your solution here. Do not touch the above lines!
        //guessedNumber = Integer.parseInt(reader.nextLine());
        while (true) {

            System.out.print("Guess a number: ");
            guessedNumber = Integer.parseInt(reader.nextLine());
            numberOfGuesses++;
            

            if (numberDrawn < guessedNumber) {
                System.out.println("The number is lesser, guesses made: " + numberOfGuesses);
            } else if (numberDrawn > guessedNumber) {
                System.out.println("The number is greater, guesses made: " + numberOfGuesses);
            } else if (numberDrawn == guessedNumber) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
