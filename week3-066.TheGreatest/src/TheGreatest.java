import java.util.ArrayList;

public class TheGreatest {
    public static int greatest(ArrayList<Integer> list) {
        int greatest = list.get(0);
        for (Integer integer : list) {
            if (integer > greatest) {
                greatest = integer;
            }
        }
        return greatest;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(-3);
        lista.add(-2);
        lista.add(-7);
        lista.add(-1);
        
        System.out.println("The greatest number is: " + greatest(lista));
    }
}
