import java.util.Scanner;

public class Palindromi {

    // The model solution asked for use of the reverse() method from exercise 56
    // I put the contents of the reverse() method inside of palindrome() instead of
    // calling reverse() inside of palindrome().
    // Still passed TMC, but perhaps not best practice.
    
    public static boolean palindrome(String text) {
        // write code here
        String reversed = "";
        for(int i=text.length() -1; i>-1; i--){
            reversed += text.charAt(i);
        }
        if(text.equals(reversed)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
