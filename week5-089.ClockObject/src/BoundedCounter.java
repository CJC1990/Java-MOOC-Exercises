
public class BoundedCounter {
    // copy here the class BoundedCounter from last weeks assignment 78

    // --object variables--
    private int value;
    private int upperLimit;

    // --constructor--
    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    // --methods--
    public void next() {
        this.value = this.getValue() + 1;

        if (this.value > this.upperLimit) {
            this.setValue(0);
        }
    }

    public String toString() {

        if (this.getValue() < 10) {
            return "0" + this.getValue();
        }
        return "" + this.getValue();
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int newValue) {

        if (newValue >= 0 && newValue <= upperLimit) {
            this.value = newValue;
        }
    }
}
