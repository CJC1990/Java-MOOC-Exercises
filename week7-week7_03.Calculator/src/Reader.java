
import java.util.Scanner;

public class Reader {

    private Scanner scanner;

    public Reader() {
        this.scanner = new Scanner(System.in);
    }

    public int readInteger() {
        return Integer.parseInt(scanner.nextLine());
    }

    public String readString() {
        return scanner.nextLine();
    }
}
