import java.util.Random;

public class PasswordRandomizer {
    private int passwordLength;
    private Random random;

    public PasswordRandomizer(int length) {
        this.passwordLength = length;
        this.random = new Random();
    }

    public String createPassword() {
        String password = "";
        char letter;
        for(int i=0; i<passwordLength; i++){
            letter = "abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(24) + 1);
            password += letter;
        }
        return password;
    }
}
