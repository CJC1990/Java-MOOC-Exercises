
public class Calculator {

    private int total;

    public Calculator() {
        total = 0;
    }

    public void add(int inputed) {
        total += inputed;
    }

    public void minus(int inputed) {
        total -= inputed;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
