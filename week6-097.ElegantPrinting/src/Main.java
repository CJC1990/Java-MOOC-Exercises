
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // Write code here
        if (array.length > 0) {
            System.out.print(array[0]);
            for (int i = 1; i < array.length; i++) {
                System.out.print(", " + array[i]);
            }
        }
    }
}
