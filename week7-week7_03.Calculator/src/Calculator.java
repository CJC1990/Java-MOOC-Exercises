
import java.util.Scanner;

public class Calculator {

    private Reader reader;
    private int calcCount;

    public Calculator() {
        this.reader = new Reader();
        this.calcCount = 0;
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }

    private void sum(){
        int[] values = setValues();
        System.out.println("sum of the values " + (values[0] + values[1]));
        calcCount++;
    }
    
    private void difference(){
        int[] values = setValues();
        System.out.println("difference of the values " + (values[0] - values[1]));
        calcCount++;
    }
    
    private void product(){
        int[] values = setValues();
        System.out.println("product of the values " + (values[0] * values[1]));
        calcCount++;
    }
    
    private int[] setValues(){
        int[] values = new int[2];
        System.out.print("value1: ");
        values[0] = reader.readInteger();
        System.out.print("value2: ");
        values[1] = reader.readInteger();
        return values;
    }
    
    private void statistics(){
        System.out.println("Calculations done " + this.calcCount);
    }
}
