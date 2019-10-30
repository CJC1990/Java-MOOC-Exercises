import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int number = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int countOfNumbers = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;
        while(number >= 0){
            countOfNumbers++;
            sum += number;
            if (number % 2 == 0){
                evenNumbers++;
            }else{
                oddNumbers++;
            }
            number = Integer.parseInt(reader.nextLine());   
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + countOfNumbers);
        System.out.println("Average: " + ((double)sum /countOfNumbers));
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
}
